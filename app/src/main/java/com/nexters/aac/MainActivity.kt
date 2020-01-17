package com.nexters.aac

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.nexters.aac.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    val intArray: Array<Int> = arrayOf(1, 2)
    val strArray: Array<String> = arrayOf("하나", "둘")

    val strList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        strList.add("셋")

        // dataBinding
        binding.data = this@MainActivity
        binding.item = ItemModel("채은", 24)

        // eventBinding
        binding.btnOne.setOnClickListener {
            Toast.makeText(this, "btnClick_one", Toast.LENGTH_SHORT).show()
        }

    }

    // eventBinding
    fun onClickBtn(view: View) {
        Toast.makeText(this, "btnClick_two", Toast.LENGTH_SHORT).show()
    }

    // eventBinding - Listener
    fun onClickListener1() {
        Toast.makeText(this, "Listener1", Toast.LENGTH_SHORT).show()
    }

    fun onClickListener2(item: ItemModel) {
        Toast.makeText(this, "Listener2 " + item.name, Toast.LENGTH_SHORT).show()
    }

    fun onClickListener3(view: View, item: ItemModel) {
        Toast.makeText(this, "Listener3 " + item.age, Toast.LENGTH_SHORT).show()
    }
}
