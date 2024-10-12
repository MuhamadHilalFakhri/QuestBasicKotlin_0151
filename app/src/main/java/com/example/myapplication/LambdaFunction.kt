package com.example.myapplication

fun uppercaseString(string: String): String{
    return string.uppercase()
}

//dapat ditulis dalam ekspresi lambda sbb:
fun main (){
    uppercaseString("Hello")
    println({string: String -> string.uppercase()}("Hello"))
}