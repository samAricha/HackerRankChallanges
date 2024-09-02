package org.example.basic


import kotlin.collections.*
import kotlin.io.*
import kotlin.ranges.*
import kotlin.text.*

/*
 * Complete the 'gradingStudents' function below.
 *
 * The function is expected to return an INTEGER_ARRAY.
 * The function accepts INTEGER_ARRAY grades as parameter.
 */

fun gradingStudents(grades: Array<Int>): Array<Int> {
    // Write your code here

    val newGrades = grades.map { grade ->
        if (grade >= 38){
            val nextMultipleOf5 = ((grade/5)+1)*5
            val newGrade = if ((nextMultipleOf5 - grade) < 3) nextMultipleOf5 else grade
            newGrade
        }else{
            grade
        }
    }.toTypedArray()

    return newGrades
}

fun main(args: Array<String>) {
    val gradesCount = readLine()!!.trim().toInt()

    val grades = Array<Int>(gradesCount, { 0 })
    for (i in 0 until gradesCount) {
        val gradesItem = readLine()!!.trim().toInt()
        grades[i] = gradesItem
    }

    val result = gradingStudents(grades)

    println(result.joinToString("\n"))
}
