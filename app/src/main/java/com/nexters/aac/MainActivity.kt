package com.nexters.aac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
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
        binding.data = this@MainActivity
        binding.item = ItemModel("채은", 24)

        // eventBinding
        binding.btnOne.setOnClickListener{
            Toast.makeText(this, "btnClick_one",Toast.LENGTH_SHORT).show()
        }

    }

    // eventBinding
    fun onClickBtn(view: View){
        Toast.makeText(this, "btnClick_two",Toast.LENGTH_SHORT).show()
    }
}
