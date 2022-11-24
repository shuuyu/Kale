package live.shuuyu.kale.mixins;

import net.minecraft.client.gui.hud.ChatHud;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(ChatHud.class)
public class ExtendChatLengthMixin {

    @ModifyConstant(method = "addMessage(Lnet/minecraft/text/Text;)V", constant = @Constant(intValue = 100))
    private int  extendChatLength(int value) {
        return Integer.MAX_VALUE;
    }
}