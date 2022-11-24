package live.shuuyu.kale.gui

import gg.essential.elementa.ElementaVersion
import gg.essential.elementa.WindowScreen
import gg.essential.elementa.components.UIText
import gg.essential.elementa.constraints.CenterConstraint
import gg.essential.elementa.dsl.*
import gg.essential.universal.GuiScale
import net.minecraft.client.gui.screen.Screen
import java.awt.Color

class KaleGui(parent: Screen) : WindowScreen(
    version = ElementaVersion.V2,
    newGuiScale = GuiScale.scaleForScreenSize().ordinal,
    restoreCurrentGuiOnClose = true
) {
    init {
        UIText("I am here to taunt you", shadow = true).constrain {
            x = 2.pixels
            y = CenterConstraint()
            textScale = 2.pixels
            color = Color.GREEN.darker().toConstraint()
        } childOf window
    }

    override fun close() {

    }
}