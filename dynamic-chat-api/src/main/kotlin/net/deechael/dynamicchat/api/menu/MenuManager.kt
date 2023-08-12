package net.deechael.dynamicchat.api.menu

interface MenuManager {

    fun getMaxRegisteredIndex(): Int

    fun getMinRegisteredIndex(): Int

    fun isIndexRegistered(index: Int): Boolean

    fun getMenuButtons(): List<MenuButton>

    /**
     * This button will be seen whoever clicked
     */
    fun registerMenuButton(index: Int, button: MenuButton)

    /**
     * This button will only be seen when sender clicked
     */
    fun registerSenderMenuButton(index: Int, button: MenuButton)

}