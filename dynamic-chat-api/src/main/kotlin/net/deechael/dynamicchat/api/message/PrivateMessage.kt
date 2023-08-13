package net.deechael.dynamicchat.api.message

import net.deechael.dynamicchat.api.user.User

interface PrivateMessage : Message {

    fun getReceiver(): User

}