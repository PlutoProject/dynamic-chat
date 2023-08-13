package net.deechael.dynamicchat.api.chat

import net.deechael.dynamicchat.api.message.Message

interface ChatHistory {

    fun getMessageLength(): Int

    fun getContext(start: Message, former: Int, latter: Int): Context

    fun getContext(last: Int): Context

    fun getMessageById(id: String): Message

}