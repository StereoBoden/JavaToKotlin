package com.jaimeboden.javatokotlin

import android.app.Activity
import android.widget.Toast

class KotlinHelper {
    fun sayHello(activity: Activity) {
        Toast.makeText(activity, "Hello From Kotlin!", Toast.LENGTH_LONG).show()
    }
}