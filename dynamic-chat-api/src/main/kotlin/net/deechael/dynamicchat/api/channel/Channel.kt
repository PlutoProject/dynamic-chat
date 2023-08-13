package net.deechael.dynamicchat.api.channel

import net.deechael.dynamicchat.api.chat.ChatFormat
import net.deechael.dynamicchat.api.chat.ChatHistory
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

    fun isDroppable(): Boolean

    fun isDropped(): Boolean

    fun getChatHistory(): ChatHistory

}