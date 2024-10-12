package com.example.myapplication

fun ConditionalStatement() {

    //If-else
    val number = 10
    if (number > 0){
        println("Positive Number")
    } else {
        println("Negative Number")
    }

    // When
    val day = 1
    when (day){
        1 -> println("Sunday")
        2 -> println("Monday")
        3 -> println("Tuesday")
        4 -> println("Wednesday")
        5 -> println("Thursday")
        6 -> println("Friday")
        7 -> println("Saturday")
        else -> print("Invalid Day")
    }

    //try-catch
    val value = "10"
    try{
        val result = value.toInt()
        println("Result: $result")
    }catch (e: NumberFormatException){
        println("Invalid Number")
    }
}
fun Perulangan(){
    println()
    println("=== Perulangan ===")
}