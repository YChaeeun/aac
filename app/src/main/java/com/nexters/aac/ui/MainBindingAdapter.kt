package com.nexters.aac.ui

import android.widget.Button
import androidx.databinding.BindingAdapter

class MainBindingAdapter {
    companion object {
        @JvmStatic
        @BindingAdapter("isBtnEnabled")
        fun isBtnEnabled(view : Button, enable : Boolean ){
            view.isEnabled = enable
        }
    }
}