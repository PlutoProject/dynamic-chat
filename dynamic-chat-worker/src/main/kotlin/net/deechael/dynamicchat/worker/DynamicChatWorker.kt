package net.deechael.dynamicchat.worker

import cloud.commandframework.execution.CommandExecutionCoordinator
import cloud.commandframework.paper.PaperCommandManager
import club.plutomc.plutoproject.framework.messaging.common.BasicMessageManager
import net.deechael.dynamicchat.api.DynamicChatService
import net.deechael.dynamicchat.api.chat.ChatFormat
import net.deechael.dynamicchat.worker.command.ChannelCommand
import net.deechael.dynamicchat.worker.configuration.GeneralConfiguration
import net.kyori.adventure.text.Component
import org.bukkit.plugin.java.JavaPlugin
import java.util.function.Function

object DynamicChatWorker: JavaPlugin() {

    private lateinit var configuration: GeneralConfiguration
    private lateinit var messageManager: BasicMessageManager
    private lateinit var vanillaChatFormat: ChatFormat

    private val commandManager = PaperCommandManager(
        this,
        CommandExecutionCoordinator.simpleCoordinator(),
        Function.identity(),
        Function.identity()
    )

    override fun onEnable() {
        this.commandManager.registerBrigadier()

        this.configuration = loadConfiguration()
        this.messageManager = BasicMessageManager(configuration.getJedisProvider().provide())
        this.vanillaChatFormat = DynamicChatService.getService()
            .getChatManager()
            .createChatFormat()
            .appendText("<")
            .appendComponent {
                it.getChannel().getUserDisplayName(it.getSender())
            }
            .appendText(">")
            .appendSpace()
            .appendComponent {
                it.getContent()
            }
            .build()

        this.registerCommands()
    }

    private fun registerCommands() {
        ChannelCommand.register(this.commandManager)
    }

    private fun loadConfiguration(): GeneralConfiguration {
        TODO()
    }

}