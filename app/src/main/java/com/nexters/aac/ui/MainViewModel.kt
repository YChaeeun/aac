package com.nexters.aac.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private val _greeting = MutableLiveData<String>("메롱")
    val greeting : LiveData<String> get() = _greeting

    fun changeGreeting(greets: String){
        _greeting.value = greets
    }

}