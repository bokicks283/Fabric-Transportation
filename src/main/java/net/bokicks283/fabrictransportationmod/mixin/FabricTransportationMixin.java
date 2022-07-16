package net.bokicks283.fabrictransportationmod.mixin;

import net.bokicks283.fabrictransportationmod.FabricTransportationMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FabricTransportationMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		FabricTransportationMod.LOGGER.info("Fabric Transportation Loaded!");
	}
}
