package com.naim.androidcompositionpatternexample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.naim.androidcompositionpatternexample.composite.CoveredVan
import com.naim.androidcompositionpatternexample.leaf.Jeep
import com.naim.androidcompositionpatternexample.leaf.MotorCycle
import com.naim.androidcompositionpatternexample.leaf.PrivateCar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val coveredVan = CoveredVan("TATA", "NT200")
        coveredVan.addTransport(PrivateCar("Premio", "AT-2022"))
        coveredVan.addTransport(PrivateCar("Axio", "AT-2021"))
        coveredVan.addTransport(Jeep("Prado", "AT-2020"))
        coveredVan.addTransport(Jeep("BMW", "AT-2022"))
        coveredVan.addTransport(MotorCycle("Suzuki", "RM-5"))
        coveredVan.addTransport(Jeep("Nissan", "AT-2022"))
        coveredVan.move()
    }
}