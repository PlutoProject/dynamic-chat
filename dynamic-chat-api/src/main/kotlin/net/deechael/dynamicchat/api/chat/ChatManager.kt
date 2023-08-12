package net.deechael.dynamicchat.api.chat

interface ChatManager {

    fun createChatFormat(): ChatFormat.Builder

    fun setWhisperFormat(format: ChatFormat)

    fun getWhisperFormat(): ChatFormat

}