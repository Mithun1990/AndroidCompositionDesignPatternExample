package com.naim.androidcompositionpatternexample.composite

import com.naim.androidcompositionpatternexample.component.Transport
import com.naim.androidcompositionpatternexample.interfaces.ITransportManager

class CoveredVan constructor(private val model: String, private val brand: String) : Transport(),
    ITransportManager {
    private val transportList = mutableListOf<Transport>()

    override fun move() {
        println("$model ${this::class.java.name} with $brand is moving")
        transportList.forEach {
            it.move()
        }
    }

    override fun addTransport(transport: Transport) {
        transportList.add(transport)
    }

    override fun removeTransport(transport: Transport) {
        transportList.remove(transport)
    }
}