package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*
import kotlin.concurrent.timerTask

class LiveDataViewModel : ViewModel() {
    val elapsedTime = MutableLiveData<Long>()

    private val timer = Timer()

    init {
        timer.scheduleAtFixedRate(
            timerTask {
                // Lógica de negócios (atualização da informação)
                val value = elapsedTime.value?.toLong() ?: 0L
                elapsedTime.postValue(value + 1L)
            },
            1000,
            1000
        )
    }

    override fun onCleared() {
        timer.cancel()
    }
}
