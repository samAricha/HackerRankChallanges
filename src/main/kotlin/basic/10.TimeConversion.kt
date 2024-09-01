package org.example.basic

import kotlin.io.*


/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
    val timePeriod = s.takeLast(2).uppercase()
    val(hour, minute, second) = s.dropLast(2).split(":")
    val hourInt = hour.toInt()
    val militaryHour = when(timePeriod){
        "AM" -> if (hourInt == 12) "00" else hour.padStart(2, '0')
        "PM" -> if (hourInt == 12) "12" else (hourInt+12).toString()
        else -> throw IllegalArgumentException("Invalid Time Period")
    }

    return "$militaryHour:$minute:$second"
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
