package com.xlk.gank.base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.xlk.gank.util.LogUtil


/**
 * Created by xlk on 2020/4/27.
 *
 */
abstract class BaseActivity<V : ViewDataBinding, VM : BaseViewModel> : AppCompatActivity() {
    protected lateinit var binding: V
    protected lateinit var viewmodel: VM
    var viewmodelId: Int = 0

    val tag = "BaseActivity-->"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewDataBinding(savedInstanceState)
        LogUtil.d(tag, "onCrate--$this")
    }

    abstract fun initContentView(savedInstanceState: Bundle?): Int

    abstract fun initViewModel(): VM
    abstract fun initVariableId(): Int

    protected fun initViewDataBinding(savedInstanceState: Bundle?) {
        binding = DataBindingUtil.setContentView(this, initContentView(savedInstanceState))
        viewmodel = initViewModel();
        viewmodelId = initVariableId();
        binding.setVariable(viewmodelId, viewmodel)
        binding.lifecycleOwner = this
        lifecycle.addObserver(viewmodel)
    }
}