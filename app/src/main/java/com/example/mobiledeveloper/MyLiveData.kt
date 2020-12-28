package com.example.mobiledeveloper

import androidx.lifecycle.LiveData

class MyLiveData: LiveData<String>() {

    //функция которая имитирует изменения в BD в данном случае
    fun setValueToLiveData(string: String){
        value = string
    }


    override fun onActive() {
        super.onActive()
        println("onActive")
        //Connect to DataBase
    }

    override fun onInactive() {
        super.onInactive()
        println("onInactive")

        //Disconnect to DataBase
    }
}