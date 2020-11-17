package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

//    private val timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        val viewModel =
            ViewModelProvider(this, LiveDataViewModelFactory())
                .get(LiveDataViewModel::class.java)

        viewModel.elapsedTime.observe(this, Observer {
            textView.text = it.toString()
        })

//        // Lógica de apresentação (atualizando a UI)
//        textView.text = viewModel.elapsedTime.toString()

//        // Lógica de negócios (início da timer task)
//        timer.scheduleAtFixedRate(
//            timerTask {
//                // Lógica de negócios (atualização da informação)
//                viewModel.elapsedTime += 1
//
//                // Lógica de apresentação (atualizando a UI)
//                textView.post {
//                    textView.text = viewModel.elapsedTime.toString()
//                }
//            },
//            1000,
//            1000
//        )
    }

//    override fun onDestroy() {
//        super.onDestroy()
//
//        timer.cancel()
//    }
}
