package net.deechael.dynamicchat.api.event.user

import net.kyori.adventure.text.Component

interface UserQuitEvent : UserEvent {

    fun getQuitMessage(): Component

    fun setQuitMessage(message: Component)

}