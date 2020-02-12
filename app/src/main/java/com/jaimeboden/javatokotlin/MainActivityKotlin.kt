package com.jaimeboden.javatokotlin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main_java.*

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_java)

        buttonJava.setOnClickListener {
            initJavaHelper()
        }

        buttonKotlin.setOnClickListener {
            initKotlinHelper()
        }

        buttonSwitchKotlin.setOnClickListener {
            switchToJava()
        }
    }

    private fun initJavaHelper() {
        val jh = JavaHelper()
        jh.sayHello(this)
    }

    private fun initKotlinHelper() {
        val kh = KotlinHelper()
        kh.sayHello(this)
    }

    private fun switchToJava() {
        val kotlinIntent = Intent(this, MainActivityJava::class.java)
        startActivity(kotlinIntent)
    }
}
