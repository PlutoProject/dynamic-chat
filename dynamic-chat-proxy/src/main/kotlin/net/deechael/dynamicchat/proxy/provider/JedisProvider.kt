package net.deechael.dynamicchat.worker.provider

import redis.clients.jedis.JedisPool

interface JedisProvider : Provider<JedisPool> {

}