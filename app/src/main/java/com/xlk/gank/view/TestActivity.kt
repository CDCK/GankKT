package com.xlk.gank.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.xlk.gank.R
import com.xlk.gank.databinding.ActivityTestBinding
import com.xlk.gank.viewmodel.TestViewModel

class TestActivity : AppCompatActivity() {
    lateinit var binding: ActivityTestBinding
    lateinit var viewmodel: TestViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_test)
        viewmodel = TestViewModel()
        binding.test = viewmodel
    }
}
