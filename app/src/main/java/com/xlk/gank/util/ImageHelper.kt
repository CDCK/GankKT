package com.xlk.gank.util

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Created by xlk on 2020/4/23.
 */
object ImageHelper {

    @JvmStatic
    @BindingAdapter({"imageurl"})
    fun loadImage(iv: ImageView, url: String?) {
        Glide.with(iv).load(url).into(iv)
    }
}