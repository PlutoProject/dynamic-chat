package net.deechael.dynamicchat.worker.provider

interface Provider<T> {

    fun provide(): T

}