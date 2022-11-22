package live.shuuyu.kale

import gg.essential.universal.UScreen
import net.fabricmc.api.ClientModInitializer

class KaleCore: ClientModInitializer {
    override fun onInitializeClient() {
        TODO("Not yet implemented")
    }

    companion object {
        const val MOD_ID = "kale"
        const val VERSION = "0.0.1"
        var gui: UScreen? = null
    }
}