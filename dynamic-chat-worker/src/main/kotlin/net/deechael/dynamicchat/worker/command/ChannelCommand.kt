package net.deechael.dynamicchat.worker.command

import cloud.commandframework.arguments.standard.StringArgument
import cloud.commandframework.paper.PaperCommandManager
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object ChannelCommand {

    fun register(commandManager: PaperCommandManager<CommandSender>) {
        commandManager.commandBuilder("channel")
            .senderType(Player::class.java)
            .argument(StringArgument.newBuilder<CommandSender>("channel_name").withSuggestionsProvider { context, _ ->
                val player = context.sender as Player
                TODO("Show all the channels this player can access")
                // return listOf(...)
            }.single())
            .handler { context ->
                val player = context.sender as Player
                val channel: String = context["channel_name"]

                TODO("Try to switch channel")
            }
    }

}