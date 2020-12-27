package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle

class MainActivity : AppCompatActivity() {

    private val getData = GetData()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //    lifecycle.addObserver(getData)
        if (lifecycle.currentState== Lifecycle.State.INITIALIZED)
            println("INITIALIZED")
        if (lifecycle.currentState== Lifecycle.State.CREATED)
            println("CREATED")

    }

    override fun onResume() {
      //  if (lifecycle.currentState== Lifecycle.State.STARTED)
        if (lifecycle.currentState== Lifecycle.State.CREATED)
        //    println("STARTED")
            println("CREATED")
        super.onResume()
    }








}