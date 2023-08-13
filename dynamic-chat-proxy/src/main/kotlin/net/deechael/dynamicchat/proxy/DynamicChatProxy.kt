package net.deechael.dynamicchat.proxy

import club.plutomc.plutoproject.framework.messaging.common.BasicMessageManager
import com.google.common.eventbus.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import net.deechael.dynamicchat.worker.configuration.GeneralConfiguration
import org.slf4j.Logger
import java.nio.file.Path
import javax.inject.Inject


@Plugin(
    id = "dynamicchat",
    name = "Dynamic Chat Proxy",
    version = "\${version}",
    authors = ["DeeChael"]
)
class DynamicChatProxy @Inject constructor(private val server: ProxyServer, private val logger: Logger, @DataDirectory private val dataDirectory: Path) {


    private lateinit var configuration: GeneralConfiguration
    private lateinit var messageManager: BasicMessageManager

    init {
        this.configuration = loadConfiguration()
    }

    @Subscribe
    fun onProxyInitialization(event: ProxyInitializeEvent) {
        this.messageManager = BasicMessageManager(configuration.getJedisProvider().provide())
        this.messageManager.initChannel("dynamichat-main", "{\"slug\": \"init\"}")
    }

    private fun loadConfiguration(): GeneralConfiguration {
        TODO()
    }

}