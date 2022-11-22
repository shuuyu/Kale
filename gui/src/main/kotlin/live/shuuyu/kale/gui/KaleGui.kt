package live.shuuyu.kale.gui

import gg.essential.elementa.ElementaVersion
import gg.essential.elementa.WindowScreen
import gg.essential.elementa.components.UIBlock
import gg.essential.elementa.dsl.constrain
import gg.essential.elementa.dsl.provideDelegate
import gg.essential.universal.GuiScale

class KaleGui: WindowScreen(
    version = ElementaVersion.V2,
    newGuiScale = GuiScale.scaleForScreenSize().ordinal,
    restoreCurrentGuiOnClose = true
) {
    init {

    }

    val background by UIBlock().constrain {

    }
}