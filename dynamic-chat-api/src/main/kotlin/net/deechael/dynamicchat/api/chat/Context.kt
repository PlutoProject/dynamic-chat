package net.deechael.dynamicchat.api.chat

import net.deechael.dynamicchat.api.channel.Channel
import net.deechael.dynamicchat.api.message.Message

interface Context : Iterable<Message> {

    fun getLength(): Int

    fun getChannel(): Channel

    fun getMessages(): List<Message>

    override fun iterator(): ContextIterator

}

interface ContextIterator : MutableIterator<Message> {

    /**
     * To check whether iterator has previous object
     *
     * @return status
     */
    fun hasPrevious(): Boolean

    /**
     * In contrast to Iterator#next()
     *
     * @return previous object
     */
    fun previous(): Message

    /**
     * Get the index in recorded messages of current message object
     * @return the index in recorded messages
     */
    fun getCurrentMessageIndex(): Int

    /**
     * Get the id in recorded messages of current message object
     * @return the id in recorded messages
     */
    fun getCurrentMessageId(): String

}