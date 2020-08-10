package com.example.exercise_one

import kotlin.concurrent.thread

fun main(){
    println("Start")

    for(i in 1..100){
        Thread.sleep(100)
        println(i)
    }
}