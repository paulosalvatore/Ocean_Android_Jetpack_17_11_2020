package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.activity_live_data.*

class LiveDataActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_live_data)

        val viewModel =
            ViewModelProvider(this, LiveDataViewModelFactory())
                .get(LiveDataViewModel::class.java)

        viewModel.elapsedTime.observe(this, Observer {
            textView.text = it.toString()
        })
    }
}
