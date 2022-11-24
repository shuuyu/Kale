package live.shuuyu.kale.modmenu

import com.terraformersmc.modmenu.api.ConfigScreenFactory
import com.terraformersmc.modmenu.api.ModMenuApi
import live.shuuyu.kale.gui.KaleGui

class ModMenuImpl: ModMenuApi {
    override fun getModConfigScreenFactory(): ConfigScreenFactory<*> {
        return ConfigScreenFactory { parent -> KaleGui(parent) }
    }
}