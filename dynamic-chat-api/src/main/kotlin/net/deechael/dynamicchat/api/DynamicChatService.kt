package net.deechael.dynamicchat.api

import net.deechael.dynamicchat.api.channel.ChannelManager
import net.deechael.dynamicchat.api.chat.ChatManager
import net.deechael.dynamicchat.api.menu.MenuManager

interface DynamicChatService {

    fun getChannelManager(): ChannelManager

    fun getChatManager(): ChatManager

    fun getMenuManager(): MenuManager

    companion object {

        private var service: DynamicChatService? = null

        fun getService(): DynamicChatService {
            if (this.service == null)
                this.service = Class.forName("net.deechael.dynamicchat.impl.DynamicChatServiceImpl").kotlin.objectInstance as DynamicChatService?
            return this.service!!
        }

    }

}