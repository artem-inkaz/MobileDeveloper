package com.example.mobiledeveloper

import android.os.CountDownTimer
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

//не является частью MainActivity
class MainViewModel:ViewModel() {

    val liveData = MutableLiveData<String>()


    //запускается после того как создался экземпляр класса
    //запускаем таймер
   init {
    startTimer()
    }


    fun startTimer(){

        object : CountDownTimer(20000, 1000){

            override fun onFinish() {
                TODO("Not yet implemented")
            }

            override fun onTick(p0: Long) {
                 liveData.value = (p0/1000).toString()
          //      textView.text = (p0/1000).toString()
            }


        }.start()
    }
}