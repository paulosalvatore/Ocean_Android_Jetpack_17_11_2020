package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

@Suppress("UNCHECKED_CAST")
class LiveDataViewModelFactory() : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return LiveDataViewModel() as T
    }
}
