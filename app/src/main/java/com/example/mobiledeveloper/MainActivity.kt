package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val getData = GetData()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//получаем название метода откуда мы запускаемся
        println(object :Any(){}.javaClass.enclosingMethod?.name)
    }

    override fun onStart() {
        println(object :Any(){}.javaClass.enclosingMethod?.name)
        getData.getData()
        super.onStart()
    }

//    override fun onResume() {
//        println(object :Any(){}.javaClass.enclosingMethod?.name)
//        super.onResume()
//    }

//    override fun onPause() {
//        println(object :Any(){}.javaClass.enclosingMethod?.name)
//        super.onPause()
//    }

    override fun onStop() {
        println(object :Any(){}.javaClass.enclosingMethod?.name)
        getData.sendData()
        super.onStop()
    }

//    override fun onDestroy() {
//        println(object :Any(){}.javaClass.enclosingMethod?.name)
//        super.onDestroy()
//    }
}