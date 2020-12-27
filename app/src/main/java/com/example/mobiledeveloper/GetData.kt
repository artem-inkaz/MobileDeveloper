package com.example.mobiledeveloper

import androidx.lifecycle.LifecycleObserver

class GetData: LifecycleObserver {

    fun getData(){
        println("Get Data")
    }

    fun sendData(){
        println("Send Data")
    }
}