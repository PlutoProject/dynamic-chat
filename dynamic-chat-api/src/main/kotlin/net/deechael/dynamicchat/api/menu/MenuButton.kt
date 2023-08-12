package net.deechael.dynamicchat.api.menu

import net.deechael.dynamicchat.api.message.Message
import net.deechael.dynamicchat.api.user.User
import net.kyori.adventure.text.Component

interface MenuButton {

    fun render(invoker: User, message: Message): Component

    fun hover(invoker: User, message: Message): Component {
        return Component.empty()
    }

}