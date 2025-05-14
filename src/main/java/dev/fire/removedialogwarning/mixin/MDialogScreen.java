package dev.fire.removedialogwarning.mixin;

import net.minecraft.client.gui.screen.dialog.DialogScreen;
import net.minecraft.client.gui.widget.*;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(DialogScreen.class)
public class MDialogScreen {
	@Shadow private ButtonWidget warningButton;

	@Inject(method = "init", at = @At("TAIL"))
	protected void init(CallbackInfo ci) {
		this.warningButton.visible = false;
	}
}

