package net.deechael.dynamicchat.api.menu

import net.deechael.dynamicchat.api.message.Message
import net.deechael.dynamicchat.api.user.User

interface CopyMessageMenuButton : MenuButton {

    fun copyValue(invoker: User, message: Message): String {
        return ""
    }

}