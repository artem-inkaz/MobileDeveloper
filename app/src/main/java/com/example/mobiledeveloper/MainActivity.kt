package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        object : CountDownTimer(20000, 1000){

            override fun onFinish() {
                TODO("Not yet implemented")
            }

            override fun onTick(p0: Long) {
                textView.text = (p0/1000).toString()
            }


        }.start()

    }
}