package com.example.mobiledeveloper

import android.app.Application
import android.os.CountDownTimer
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.android.synthetic.main.activity_main.*

//не является частью MainActivity
//class MainViewModel:ViewModel() {
//специльный класс AndroidViewModel который содержит ссылку на контекст
    class MainViewModel(application: Application, val text:String):AndroidViewModel(application) {

    val liveData = MutableLiveData<String>()


    //запускается после того как создался экземпляр класса
    //запускаем таймер
   init {
    startTimer()
    }


    fun startTimer(){

        object : CountDownTimer(10000, 1000){

            override fun onFinish() {
                Toast.makeText(getApplication(),text, Toast.LENGTH_LONG).show()
            }

            override fun onTick(p0: Long) {
                 liveData.value = (p0/1000).toString()
          //      textView.text = (p0/1000).toString()
            }


        }.start()
    }
}