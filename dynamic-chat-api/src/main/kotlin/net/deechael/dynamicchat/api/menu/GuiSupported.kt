package net.deechael.dynamicchat.api.menu

import net.deechael.dynamicchat.api.message.Message
import net.deechael.dynamicchat.api.user.User
import org.bukkit.inventory.ItemStack

interface GuiSupported {

    /**
     * Null for not show for this invoker
     */
    fun renderIcon(invoker: User, message: Message): ItemStack?

}