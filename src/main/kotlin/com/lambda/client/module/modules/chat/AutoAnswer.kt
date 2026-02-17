package com.lambda.client.module.modules.chat

import com.lambda.client.event.events.PacketEvent
import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.client.util.text.MessageSendHelper
import com.lambda.client.util.threads.safeListener
import net.minecraft.network.play.server.SPacketChat
import java.io.File

object AutoAnswer : Module(
    name = "AutoAnswer",
    description = "Auto click chat and answer",
    category = Category.CHAT
) {
    private const val FILENAME = "AutoAnswer.txt"
    private val answerMap = mutableMapOf<String, String>()

    init {
        onEnable {
            answerMap.clear()
            val file = File(FILENAME)
            if (file.exists()) {
                file.readLines().forEach { line ->
                    if (line.contains("|")) {
                        val parts = line.split("|")
                        if (parts.size >= 2) {
                            val question = parts[0].trim()
                            val answer = parts[1].trim()
                            if (question.isNotEmpty() && answer.isNotEmpty()) {
                                answerMap[question] = answer
                            }
                        }
                    }
                }
                MessageSendHelper.sendChatMessage("[$name] Loaded ${answerMap.size} rules")
            } else {
                file.writeText("Question | Answer\nQuestion2 | Answer2")
                MessageSendHelper.sendChatMessage("[$name] Rule file created: ${file.absolutePath}")
            }
        }
        safeListener<PacketEvent.Receive> { event ->
            if (event.packet is SPacketChat) {
                val message = event.packet.chatComponent.unformattedText
                for ((question, answer) in answerMap) {
                    if (message.contains(question, ignoreCase = true)) {
                        player.sendChatMessage(answer)
                        MessageSendHelper.sendChatMessage("[$name] found question: $question, answer: $answer")
                        break
                    }
                }
            }
        }
    }
}