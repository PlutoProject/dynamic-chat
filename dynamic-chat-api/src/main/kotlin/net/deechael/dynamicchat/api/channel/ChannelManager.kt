package net.deechael.dynamicchat.api.channel

interface ChannelManager {

    fun getGlobalChannel(): Channel

    fun setGlobalChannel(channel: Channel)

    fun getChannels(): List<Channel>

    fun getChannel(name: String): Channel

    fun hasChannel(name: String): Channel

    fun createChannel(name: String): Channel

    fun deleteChannel(channel: Channel): Boolean

    fun deleteChannel(name: String): Boolean

}