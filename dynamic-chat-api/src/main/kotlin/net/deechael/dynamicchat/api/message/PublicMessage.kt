package net.deechael.dynamicchat.api.message

import net.deechael.dynamicchat.api.channel.Channel

interface PublicMessage : Message {

    fun getChannel(): Channel

    fun getIndex(): Int

}