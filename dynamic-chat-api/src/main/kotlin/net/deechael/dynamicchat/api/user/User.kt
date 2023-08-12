package net.deechael.dynamicchat.api.user

import net.deechael.dynamicchat.api.channel.Channel
import net.kyori.adventure.text.Component
import java.util.UUID

interface User {

    fun getUniqueId(): UUID

    fun getName(): String

    fun sendMessage(message: Component)

    fun whisperTo(who: User, message: Component)

    fun say(message: Component)

    fun chat(message: Component)

    fun moveTo(channel: Channel): Boolean

    fun getCurrentChattingChannel(): Channel

    fun getAvailableChannels(): List<Channel>

}