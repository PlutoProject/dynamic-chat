package net.deechael.dynamicchat.worker.configuration

import net.deechael.dynamicchat.worker.provider.JedisProvider

interface GeneralConfiguration {

    fun getJedisProvider(): JedisProvider

}