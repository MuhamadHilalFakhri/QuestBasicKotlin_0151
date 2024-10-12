package com.example.myapplication

import android.graphics.drawable.shapes.Shape

fun ContohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //List Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari list Mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)

}

fun ContohSet (){
    println()
    println("=== Set ===")

    val readOnlyAbjad = setOf("A","B","C")
    println(readOnlyAbjad)

    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Rectangle")
    println(shape)

    shape.remove("Circle")
    println(shape)

    val shapesLocked: Set<String> = shape
    println(shapesLocked)
}

fun ContohMap(){

    println()
    println("=== Map ===")

    val readOnlyShape: Map<String, Int> = mapOf("Circle" to 1, "Square" to 2, "Triangle" to 3)
    println(readOnlyShape)

    val shape: MutableMap<String, Int> = mutableMapOf("CIrcle" to 1, "Square" to 2, "Triangle" to 3)
    println(shape)

    shape["Rectangle"] = 4
    println(shape)

    shape.remove("Circle")
    println(shape)


}

fun main(){
    ContohList()

}