package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.Transformations
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    var liveDataString = MutableLiveData<String>()
    var liveDataInt = MutableLiveData<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

           liveDataString.value = "liveDataString"
            liveDataInt.value = 1

        testText.text =liveDataString.value + "string"
        testText1.text =liveDataInt.value.toString() + "int"

        //кнопка по которой будет преобразование типов из String в Int
       buttonSafe.setOnClickListener {
           liveDataString = Transformations.map(liveDataInt){
               it.toString()
           } as MutableLiveData<String>

           liveDataString.observe(this, Observer {
               testText.text=it

           })
       }

        //кнопка по которой будет преобразование типов из Int в String
//        buttonSafe.setOnClickListener {
//            liveDataInt = Transformations.map(liveDataString){
//                it.toInt()
//            } as MutableLiveData<Int>
//
//            liveDataString.observe(this, Observer {
//                testText.text=it
//
//            })
//        }


    }

}