package com.jaimeboden.javatokotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import org.jetbrains.anko.*

class MainActivityKotlin : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initialiseLayout()
    }

    fun initialiseLayout() {
        verticalLayout {
            imageView {
                imageResource = R.drawable.kotlin_logo
            }.lparams(width = wrapContent, height = wrapContent)

            button("Java"){
                onClick { initJavaHelper() }
            }.lparams(width = matchParent, height = wrapContent) {
                bottomMargin = 50
            }

            button("Kotlin"){
                onClick { initKotlinHelper() }
            }.lparams(width = matchParent, height = wrapContent) {
                bottomMargin = 50
            }

            button("Switch to Java"){
                onClick { switchToJava() }
            }.lparams(width = matchParent, height = wrapContent)
        }
    }

    fun initJavaHelper() {
        val jh = JavaHelper()
        jh.sayHello(this)
    }

    fun initKotlinHelper() {
        val kh = KotlinHelper()
        kh.sayHello(this)
    }

    fun switchToJava() {
        val kotlinIntent = Intent(this, MainActivityJava::class.java)
        startActivity(kotlinIntent)
    }
}
