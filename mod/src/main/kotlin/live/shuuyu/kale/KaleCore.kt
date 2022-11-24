package live.shuuyu.kale

import gg.essential.universal.UScreen
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.loader.api.FabricLoader
import net.minecraft.client.MinecraftClient
import org.slf4j.LoggerFactory

class KaleCore: ClientModInitializer {

    companion object {
        val logger = LoggerFactory.getLogger("Kale")
        const val MOD_ID = "kale"
        const val VERSION = "0.0.1"

        // Feather will break all of our features, so we need to turn ourselves off.
        @JvmField
        var isFeather = false
    }

    fun onPreInitialize() {
        isFeather = FabricLoader.getInstance().isModLoaded("feather")
    }

    override fun onInitializeClient() {
        MinecraftClient.getInstance().send {
            logger.info("Help me")
        }
    }
}