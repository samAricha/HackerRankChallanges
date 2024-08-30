package org.example.basic

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'simpleArraySum' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY ar as parameter.
 */

fun simpleArraySum(myArray: Array<Int>): Int {
   var sum = 0

    for (item in myArray){
        sum += item
    }
    return sum
}

fun simpleArraySum2(myArray: Array<Int>): Int {
    var sum = 0

    myArray.forEach { it -> sum += it }

    return sum
}

fun simpleArraySum3(myArray: Array<Int>) = myArray.sum()

fun main(args: Array<String>) {
    val arCount = readLine()!!.trim().toInt()

    val myArray = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

//    val result = simpleArraySum(myArray)
//    val result = simpleArraySum2(myArray)
    val result = simpleArraySum3(myArray)

    println(result)
}