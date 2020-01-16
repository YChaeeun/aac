package com.nexters.aac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.nexters.aac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    val intArray:Array<Int> = arrayOf(1,2)
    val strArray:Array<String> = arrayOf("하나", "둘")

    val strList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        strList.add("셋")

        // dataBinding
        binding.data = this
        binding.item = ItemModel("채은", 24)
    }
}
