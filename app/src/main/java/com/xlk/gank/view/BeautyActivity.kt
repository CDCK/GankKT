package com.xlk.gank.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.xlk.gank.R
import com.xlk.gank.base.BaseActivity
import com.xlk.gank.databinding.ActivityBeautyBinding
import com.xlk.gank.viewmodel.BeautyViewModel

class BeautyActivity : AppCompatActivity() {
    lateinit var binding: ActivityBeautyBinding
    lateinit var viewModel: BeautyViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_beauty)
        viewModel = BeautyViewModel()
        binding.beauty = viewModel
    }
}
