package com.lambda.client.module.modules.render

import com.lambda.client.module.Category
import com.lambda.client.module.Module
import com.lambda.client.util.Wrapper

internal object NoChunkRender : Module(
    name = "NoChunkRender",
    description = "Control Chunk Render Distance",
    category = Category.RENDER
) {
    fun shouldRender(): Boolean = !isEnabled
    init {
        onEnable {
            Wrapper.minecraft.renderGlobal?.loadRenderers()
        }
        onDisable {
            Wrapper.minecraft.renderGlobal?.loadRenderers()
        }
    }
}