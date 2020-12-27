package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val getData = GetData()

  //  private var string = "data"
    //создали экземпляр класса LiveData
    private  var liveDateString = MutableLiveData<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //обертываем в корутину
        CoroutineScope(Dispatchers.IO).launch {
        //с value будет ошибка Cannot invoke setValue on a background thread
        //liveDateString.value= "Hell Live Data"
            //с postvalue нет так как
            liveDateString.postValue("Hello LiveData")
    //    testText1.text= liveDateString.value
    }
    }


}