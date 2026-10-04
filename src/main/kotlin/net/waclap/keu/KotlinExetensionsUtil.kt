package net.waclap.keu

import net.fabricmc.api.ModInitializer
import org.slf4j.LoggerFactory

object KotlinExtensionsUtil : ModInitializer {
	const val MOD_ID: String = "kotlin-extensions-util"

	private val LOGGER = LoggerFactory.getLogger(MOD_ID)

	override fun onInitialize() {
		LOGGER.info("Loaded $MOD_ID")
	}
}
