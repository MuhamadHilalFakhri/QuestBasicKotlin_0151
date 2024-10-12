package com.example.myapplication

fun nullSafety(){
    //neverNull has string type
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a nul here"
    nullable = null

    if (neverNull == null){
        println("inferredNonNull is Null")
    } else{
        println("InferedNonNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String): Int{
        return notNull.length
    }

    println(strLength(neverNull))
}
fun main(){
    nullSafety()
}