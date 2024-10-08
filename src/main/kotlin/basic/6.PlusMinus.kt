package org.example.basic

import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val arrSize = arr.size
    var positiveCount = 0
    var negativeCount = 0
    var neutralCount = 0

    for (i in 0 until arrSize){
        when{
            arr[i] > 0 -> positiveCount++
            arr[i] < 0 -> negativeCount++
            arr[i] == 0 -> neutralCount++
        }
    }
    println(positiveCount.toFloat()/arrSize)
    println(negativeCount.toFloat()/arrSize)
    println(neutralCount.toFloat()/arrSize)
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
