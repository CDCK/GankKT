package com.xlk.kotlingank.model

import java.io.Serializable

/**
 * Created by xlk on 2019/2/27.
 */
open class RGank : Serializable {
    var images: List<String>? = null
    var scale: Float = 0.toFloat()

    override fun toString(): String {
        return "RGank{" +
                "images=" + images +
                '}'.toString()
    }
}
