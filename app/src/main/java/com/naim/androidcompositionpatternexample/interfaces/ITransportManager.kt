package com.naim.androidcompositionpatternexample.interfaces

import com.naim.androidcompositionpatternexample.component.Transport

interface ITransportManager {
    fun addTransport(transport: Transport)
    fun removeTransport(transport: Transport)
}