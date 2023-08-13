package net.deechael.dynamicchat.api.event.user

import net.kyori.adventure.text.Component

interface UserJoinEvent : UserEvent {

    fun getJoinMessage(): Component

    fun setJoinMessage(message: Component)

}