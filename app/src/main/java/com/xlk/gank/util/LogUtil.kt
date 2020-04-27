package com.xlk.gank.util

/**
 * Created by xlk on 2020/4/27.
 *
 */
object LogUtil {
    val enable = true
    val e_level = 1
    val w_level = 2
    val i_level = 3
    val d_level = 4
    val v_level = 5
    val level = v_level

    fun e(tag: String, msg: String) {
        if (enable && level > e_level) {
            android.util.Log.e(tag, msg)
        }
    }

    fun w(tag: String, msg: String) {
        if (enable && level > w_level) {
            android.util.Log.w(tag, msg)
        }
    }

    fun i(tag: String, msg: String) {
        if (enable && level > i_level) {
            android.util.Log.i(tag, msg)
        }
    }

    fun d(tag: String, msg: String) {
        if (enable && level > d_level) {
            android.util.Log.d(tag, msg)
        }
    }

    fun v(tag: String, msg: String) {
        if (enable && level > v_level) {
            android.util.Log.v(tag, msg)
        }
    }
}