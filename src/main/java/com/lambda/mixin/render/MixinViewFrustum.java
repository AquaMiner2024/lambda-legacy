package com.lambda.mixin.render;

import com.lambda.client.module.modules.render.NoChunkRender;
import net.minecraft.client.renderer.ViewFrustum;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ViewFrustum.class)
public class MixinViewFrustum {
    @Inject(method = "getRenderChunk", at = @At("HEAD"), cancellable = true)
    private void onGetRenderChunk(BlockPos pos, CallbackInfoReturnable<RenderChunk> cir) {
        if (!NoChunkRender.INSTANCE.shouldRender()) {
            cir.setReturnValue(null);
        }
    }
}
