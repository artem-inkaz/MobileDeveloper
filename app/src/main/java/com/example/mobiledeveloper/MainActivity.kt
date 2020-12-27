package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    val  liveDataString = MutableLiveData<String>()
    val  liveDataString2 = MutableLiveData<String>()
    val  mediatorLiveData = MediatorLiveData<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        liveDataString.value = "String"
        liveDataString2.value = "String2"

        mediatorLiveData.addSource(liveDataString) {

            testText.text = it
        }

        mediatorLiveData.addSource(liveDataString2) {

            testText1.text = it
        }

        mediatorLiveData.observe(this, Observer {

        })

        buttonSafe.setOnClickListener {
            liveDataString.value = edit_text.text.toString()

        }

        buttonSafe2.setOnClickListener {
            liveDataString2.value = edit_text.text.toString()

        }
    }

}