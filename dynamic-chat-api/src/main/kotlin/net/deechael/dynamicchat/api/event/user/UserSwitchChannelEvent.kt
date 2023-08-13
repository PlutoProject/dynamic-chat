package net.deechael.dynamicchat.api.event.user

import net.deechael.dynamicchat.api.channel.Channel
import net.deechael.dynamicchat.api.event.CancellableEvent

interface UserSwitchChannelEvent : UserEvent, CancellableEvent {

    fun getFrom(): Channel

    fun getTo(): Channel

}