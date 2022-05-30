package com.naim.androidcompositionpatternexample.leaf

import com.naim.androidcompositionpatternexample.component.Transport

class PrivateCar constructor(private val model: String, private val brand: String) : Transport() {
    override fun move() {
        println("$model ${this::class.java.name} with $brand is moving")
    }
}