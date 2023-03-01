package net.iessochoa.sergiomarti.practica3

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {

    //var count:Int = 0

    private val count = MutableLiveData<Int>(0)

    private val countTimes = MutableLiveData<String>("")

    fun addOne() {
        // count++
        count.value = count.value?.plus(1)
        countTimes.value = countTimes.value?.plus("*")
    }

    /**
     * Getter para el contador count
     * Es un live data para evitar que se pueda realizar modificaciones cuando
     * se accede al valor de esta variable
     */
    fun getCount():LiveData<Int> {
        return count
    }

    fun getAsterisk():LiveData<String> {
        return countTimes
    }

}