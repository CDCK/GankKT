package com.xlk.kotlingank.model

import java.io.Serializable

/**
 * Created by xlk on 2019/2/27.
 */
open class RBase : Serializable {
    var error: Boolean = false

    override fun toString(): String {
        return "RBase{" +
                "error=" + error +
                '}'.toString()
    }
}
