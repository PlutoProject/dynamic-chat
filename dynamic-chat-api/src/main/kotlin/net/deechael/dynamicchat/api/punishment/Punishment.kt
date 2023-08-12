package net.deechael.dynamicchat.api.punishment

import net.deechael.dynamicchat.api.Time
import net.deechael.dynamicchat.api.user.User
import java.util.Date

interface Punishment {

    fun getId(): String

    fun getPunishedUser(): User

    fun getOperator(): User?

    fun getStartAt(): Date

    fun getEndAt(): Date

    fun getDuration(): Time

    fun hasEnded(): Boolean

    fun getReason(): String

    fun isForever(): Boolean

}