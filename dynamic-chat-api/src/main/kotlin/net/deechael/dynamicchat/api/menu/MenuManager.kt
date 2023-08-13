package net.deechael.dynamicchat.api.menu

interface MenuManager {

    fun isOn(): Boolean

    fun turnOn()

    fun turnOff()

    fun getMaxRegisteredIndex(): Int

    fun getMinRegisteredIndex(): Int

    fun isIndexRegistered(index: Int): Boolean

    fun getMenuButtons(): List<MenuButton>

    /**
     * This button will be seen whoever clicked
     */
    fun registerMenuButton(index: Int, button: MenuButton)

}