package net.deechael.dynamicchat.api.channel

import net.deechael.dynamicchat.api.Time
import net.deechael.dynamicchat.api.chat.ChatFormat
import net.deechael.dynamicchat.api.context.Context
import net.deechael.dynamicchat.api.message.PublicMessage
import net.deechael.dynamicchat.api.punishment.Punishment
import net.deechael.dynamicchat.api.user.User
import net.kyori.adventure.text.Component
import java.util.Date
import java.util.UUID

interface Channel {

    fun getUsers(): List<User>

    fun getUser(uniqueId: UUID): User

    fun hasUser(uniqueId: UUID): Boolean

    fun hasUser(user: User): Boolean

    fun addUser(user: User): Boolean

    fun removeUser(uniqueId: UUID): Boolean

    fun removeUser(user: User): Boolean

    fun getUserDisplayName(user: User): Component

    fun setUserDisplayName(user: User, name: Component)

    fun clearUserDisplayName(user: User)

    fun getDisplayName(): Component

    fun setDisplayName(name: Component)

    fun setDisplayName(name: String, isMiniMessage: Boolean = false)

    fun getChatFormat(): ChatFormat

    fun setChatFormat(format: ChatFormat)

    fun getName(): String

    fun getCreatedTime(): Date

    fun drop(): Boolean

    fun isDropped(): Boolean

    fun mute(user: User): Boolean

    fun mute(user: User, time: Time): Boolean

    fun mute(user: User, reason: String): Boolean

    fun mute(user: User, reason: String, time: Time): Boolean

    fun unmute(user: User)

    fun isMuted(user: User)

    fun getMuteHistory(user: User): List<Punishment>

    fun getMessageLength(): Int

    fun getContext(fromIndex: Int, length: Int): Context

    fun getContext(start: PublicMessage, length: Int): Context

    fun getContext(last: Int): Context

    fun getMessageById(id: String): PublicMessage

    fun getMessageByIndex(index: Int): PublicMessage

    fun broadcast(message: Component)

}