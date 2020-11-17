package com.oceanbrasil.ocean_android_jetpack_17_11_2020

import androidx.lifecycle.ViewModel

// val representa uma informação final, ou seja,
// que não muda o valor depois de iniciar

// var representa uma informação mutável, ou seja,
// que pode mudar o valor depois de iniciar

class TextViewModel : ViewModel() {
    var text = "Hello World!"
}
