package net.deechael.dynamicchat.api.event

interface CancellableEvent : Event {

    fun cancel()

}