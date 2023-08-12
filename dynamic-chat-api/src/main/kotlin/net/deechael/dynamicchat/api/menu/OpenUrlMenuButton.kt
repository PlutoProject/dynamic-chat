package net.deechael.dynamicchat.api.menu

import net.deechael.dynamicchat.api.message.Message
import net.deechael.dynamicchat.api.user.User

interface OpenUrlMenuButton : MenuButton {

    fun url(invoker: User, message: Message): String {
        return ""
    }

}