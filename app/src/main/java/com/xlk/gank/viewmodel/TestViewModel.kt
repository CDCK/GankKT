package com.xlk.gank.viewmodel

import android.view.View
import androidx.databinding.ObservableField

/**
 * Created by xlk on 2020/4/24.
 *
 */
class TestViewModel {
    val day = ObservableField<Int>(0)

    public fun click(view: View) {
        val a = 15 / 0
        day.set(a)
    }
}