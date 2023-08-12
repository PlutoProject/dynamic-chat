package net.deechael.dynamicchat.api

import java.util.Date

interface Time {

    fun getYears(): Int

    fun getMonths(): Int

    fun getWeeks(): Int

    fun getDays(): Int

    fun getHours(): Int

    fun getMinutes(): Int

    fun getSeconds(): Int

    fun getTotalSeconds(): Long

    fun after(start: Date): Date

}