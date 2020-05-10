package com.nexters.aac._base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

abstract class BaseFragment<T:ViewDataBinding> : Fragment(){
    abstract val vm : ViewModel
    private val binding by lazy {
        DataBindingUtil.inflate(inflater, getLayoutRes(), container, false) as T
    }

    @LayoutRes
    abstract fun getLayoutRes() : Int
    abstract fun setupBinding()

    private lateinit var inflater : LayoutInflater
    private var container: ViewGroup? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        this.inflater = inflater
        this.container = container

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupBinding()
        binding.lifecycleOwner = this
    }

    fun toast(content: String) {
        with(activity) {
            if (this == null) {
                return
            }
            Toast.makeText(this, content, Toast.LENGTH_SHORT).show()
        }
    }
}