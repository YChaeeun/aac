package com.nexters.aac.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel(){

    private val _greeting = MutableLiveData<String>("메롱")
    val greeting : LiveData<String> get() = _greeting

    private val _isEnable = MutableLiveData<Boolean>().apply{value=true}
    val isEnable : LiveData<Boolean> get() = _isEnable

    fun changeGreeting(greets: String){
        _greeting.value = greets
    }

    fun makeBtnDisable(){
        _isEnable.value = false
    }

}