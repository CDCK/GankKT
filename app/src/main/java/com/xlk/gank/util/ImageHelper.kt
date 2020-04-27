package com.xlk.gank.util

import android.util.Log.d
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

/**
 * Created by xlk on 2020/4/23.
 * 类声明时的class关键字改成了object,这个类里面的成员默认都是static的.
 */
class ImageHelper {
    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun setImageUrl(iv: ImageView, url: String?) {
            d("cdck", "加载图片：$url")
            url?.let { Glide.with(iv).load(url).into(iv) }
        }
    }
}
