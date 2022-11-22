package live.shuuyu.kale.gui

import gg.essential.elementa.ElementaVersion
import gg.essential.elementa.WindowScreen
import gg.essential.elementa.components.UIBlock
import gg.essential.elementa.constraints.CenterConstraint
import gg.essential.elementa.dsl.*
import gg.essential.universal.GuiScale
import net.minecraft.client.gui.screen.Screen

class KaleGui(parent: Screen?) : WindowScreen(
    version = ElementaVersion.V2,
    newGuiScale = GuiScale.scaleForScreenSize().ordinal,
    restoreCurrentGuiOnClose = true
) {
    init {

    }

    val background by UIBlock(KalePalette.Background).constrain {
        x = CenterConstraint()
        y = CenterConstraint()
        width = 25.percent
        height = 25.percent
    } childOf window




}