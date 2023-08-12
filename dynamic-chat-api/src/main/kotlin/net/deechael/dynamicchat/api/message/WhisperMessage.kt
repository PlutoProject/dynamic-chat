package net.deechael.dynamicchat.api.message

import net.deechael.dynamicchat.api.user.User

interface WhisperMessage : Message {

    fun getReceiver(): User

}