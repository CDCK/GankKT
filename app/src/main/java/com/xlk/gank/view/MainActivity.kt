package com.xlk.gank.view

import android.content.Intent
import android.os.Bundle
import android.util.Log.d
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.hjq.permissions.OnPermission
import com.hjq.permissions.XXPermissions
import com.xlk.gank.R
import com.xlk.gank.base.BaseActivity
import com.xlk.gank.databinding.ActivityMainBinding
import com.xlk.gank.viewmodel.MainViewModel
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mainViewModel = MainViewModel(this)
        mainBinding.main = mainViewModel
        mainViewModel.random()
        applyPermissions()
    }

    private fun applyPermissions() {
        XXPermissions.with(this).constantRequest().request(object : OnPermission {
            override fun hasPermission(granted: MutableList<String>?, all: Boolean) {
                if (all) {
                    d("cdck", "权限全部获取到了")
                    Timer().schedule(object : TimerTask() {
                        override fun run() {
                            startActivity(Intent(this@MainActivity, BeautyActivity::class.java))
                        }
                    }, 1000)
                }
            }

            override fun noPermission(denied: MutableList<String>?, quick: Boolean) {

            }
        })
    }
}
