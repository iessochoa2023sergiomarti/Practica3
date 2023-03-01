package net.iessochoa.sergiomarti.practica3

import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    var count:Int = 0

    fun addOne() {
        count++
    }

}