package com.example.myapplication

fun withoutParameter(){
    println("== withoutParameter ==")
    println("Hello, World!")
}

fun withParameter (name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

fun withNamedArgument(name: String, age:Int){
    println()
    println("== withNameArgument ==")
    println("Hello, $name! You are $age years old.")
}

fun withDefaultParameter(name: String = "Indra", age: Int){
    println()
    println("== withDefautParameter ==")
    println("Hello, $name! You are $age years old.")
}
fun withReturn(panjang : Int, lebar : Int) {
    return println(panjang * lebar)
}

fun main() {
    withoutParameter()
    withParameter("John")
    withNamedArgument(name = "John", age = 30)
    withDefaultParameter(age = 25)

}