package com.example.mobiledeveloper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private val getData = GetData()

    val myLiveData = MyLiveData()
    //создаем observer отдельно
    lateinit var observer : Observer<String>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //инициализация observer
        observer = Observer {
            testText1.text=it
        }

        //наблюдатель Livedata, видим изменения и сразу реагируем
//        myLiveData.observe(this, Observer {
//            //здесь обрабатывается какой-то код изменения
//            testText1.text=it
//        })

        buttonSafe.setOnClickListener {
            myLiveData.setValueToLiveData(edit_text.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        myLiveData.observe(this,observer)
    }

    override fun onStop() {
        super.onStop()
        myLiveData.removeObserver(observer)
    }

}