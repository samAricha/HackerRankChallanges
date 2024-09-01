package org.example.basic

import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

//mini and max sum using 1 less number
fun miniMaxSum(arr: Array<Int>): Unit {
    // Write your code here
    val miniSum = arr.sum() - arr.max()
    val maxSum = arr.sum() -  arr.min()
    println("$miniSum $maxSum")
}

//mini and max sum using 2 less numbers
fun miniMaxSum2(arr: Array<Int>){
    val sortedArray: Array<Int> = arr.sortedArray()

    val miniSum = sortedArray.dropLast(2).sum()
    val maxSum = sortedArray.drop(2).sum()
    println("$miniSum $maxSum")
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

//    miniMaxSum(arr)
    miniMaxSum2(arr)
}
