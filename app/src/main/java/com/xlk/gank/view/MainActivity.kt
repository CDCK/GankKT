package com.xlk.gank.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.xlk.gank.R
import com.xlk.gank.databinding.ActivityMainBinding
import com.xlk.gank.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = MainViewModel(this)
        mainBinding.main = mainViewModel
        mainViewModel.initial()
    }
}
