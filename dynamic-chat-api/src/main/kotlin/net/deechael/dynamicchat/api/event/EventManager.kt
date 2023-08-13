package net.deechael.dynamicchat.api.event

interface EventManager {

    fun <T: Event> listen(type: Class<T>, listener: (T) -> Unit)

}