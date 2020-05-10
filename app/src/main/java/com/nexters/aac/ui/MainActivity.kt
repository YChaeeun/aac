package com.nexters.aac.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import com.nexters.aac.R
import com.nexters.aac._base.BaseActivity
import com.nexters.aac.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val vm: MainViewModel by viewModel()
    override fun getLayoutRes() = R.layout.activity_main

    override fun setupBinding() {
        binding.vm = vm
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        vm.changeGreeting("안녕하세요")

        vm.click.observe(this@MainActivity, Observer {
            if(it){
                toast(vm.click.value.toString())
            }
        })
    }
}
