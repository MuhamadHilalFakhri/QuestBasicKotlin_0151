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

}

fun main(){
    ContohList()
}