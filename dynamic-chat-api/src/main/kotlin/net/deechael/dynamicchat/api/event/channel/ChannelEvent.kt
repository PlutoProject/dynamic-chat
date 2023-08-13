package net.deechael.dynamicchat.api.event.channel

import net.deechael.dynamicchat.api.event.Event

interface ChannelEvent : Event {

    fun getChannel()

}