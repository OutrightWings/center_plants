package net.outrightwings.center_plants.mixin;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.BlockView;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(net.minecraft.block.AbstractBlock.AbstractBlockState.class)
public class AbstractBlockState {
    @Inject(at = @At("HEAD"),method = "getModelOffset(Lnet/minecraft/world/BlockView;Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;",cancellable = true)
    private void getModelOffset(BlockView world, BlockPos pos, CallbackInfoReturnable<Vec3d> cir){
        cir.setReturnValue(Vec3d.ZERO);
    }
}
