package net.deechael.dynamicchat.api.menu

import net.deechael.dynamicchat.api.message.Message
import net.deechael.dynamicchat.api.user.User

interface ClickMenuButton : MenuButton {

    fun click(invoker: User, message: Message) {
    }

}