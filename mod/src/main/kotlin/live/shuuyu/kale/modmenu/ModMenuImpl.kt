package live.shuuyu.kale.modmenu

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import live.shuuyu.kale.gui.KaleGui
import net.minecraft.client.gui.screen.Screen

class ModMenuImpl: ModMenuApi {
    override fun getModConfigScreenFactory() = ConfigScreenFactory {
        parent: Screen? -> KaleGui(parent)
    }
}