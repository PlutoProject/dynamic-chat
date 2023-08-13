package net.deechael.dynamicchat.api.event.user

import net.deechael.dynamicchat.api.channel.Channel
import net.deechael.dynamicchat.api.event.CancellableEvent
import net.kyori.adventure.text.Component

interface UserChatEvent : UserEvent, CancellableEvent {

    fun getChannel(): Channel

    fun setChannel(channel: Channel)

    fun getContent(): Component

    fun setContent(content: Component)

}