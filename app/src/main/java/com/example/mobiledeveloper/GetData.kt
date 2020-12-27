package com.example.mobiledeveloper

import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class GetData: LifecycleObserver {

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun getData(){
        println("Get Data")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun sendData(){
        println("Send Data")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    fun any(){
        println("any")
    }
}