package com.nexters.aac

import android.view.View
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

class ItemObservableField {

    val city = ObservableField<String>("Suncheon")
    val birthYear = ObservableInt(1997)

    fun onClickChangeProperty1() {
        city.set("Yeosu")
        birthYear.set(2020)
    }

    fun onClickChangeProperty2(view: View) {
        city.set("Seoul")
        birthYear.set(1980)
    }
}