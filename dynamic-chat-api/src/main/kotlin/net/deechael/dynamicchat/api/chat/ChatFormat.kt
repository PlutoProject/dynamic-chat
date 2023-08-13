package net.deechael.dynamicchat.api.chat

import net.deechael.dynamicchat.api.message.Message
import net.kyori.adventure.text.Component

interface ChatFormat {

    fun format(message: Message): Component

    interface Builder {

        fun appendSpace(): Builder

        fun appendNewLine(): Builder

        fun appendMessage(serializer: (Message) -> Component): Builder

        fun appendComponent(serializer: (Message) -> Component): Builder

        fun appendText(serializer: (Message) -> String): Builder

        fun appendText(text: String): Builder

        fun hover(serializer: (Message) -> Component): Builder

        fun build(): ChatFormat

    }

}