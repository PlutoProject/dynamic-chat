package net.deechael.dynamicchat.api.channel

import net.deechael.dynamicchat.api.Time
import net.deechael.dynamicchat.api.punishment.Punishment
import net.deechael.dynamicchat.api.user.User
import net.kyori.adventure.text.Component

interface PublicChannel : Channel {


    fun mute(user: User): Boolean

    fun mute(user: User, time: Time): Boolean

    fun mute(user: User, reason: String): Boolean

    fun mute(user: User, reason: String, time: Time): Boolean

    fun unmute(user: User)

    fun isMuted(user: User)

    fun getMuteHistory(user: User): List<Punishment>

    fun broadcast(message: Component)

}