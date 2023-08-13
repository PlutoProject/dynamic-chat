package net.deechael.dynamicchat.api.event.user

import net.deechael.dynamicchat.api.event.Event
import net.deechael.dynamicchat.api.user.User

interface UserEvent : Event {

    fun getUser(): User

}