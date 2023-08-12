package net.deechael.dynamicchat.api.message

import net.deechael.dynamicchat.api.user.User
import net.kyori.adventure.text.Component
import java.util.Date

interface Message {

    fun getSender(): User

    fun getContent(): Component

    fun getId(): String

    fun getCreatedTime(): Date

}