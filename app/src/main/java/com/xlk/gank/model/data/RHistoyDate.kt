package com.xlk.kotlingank.model

/**
 * Created by xlk on 2019/2/22.
 * 历史发布过的日期
 */
class RHistoyDate : RBase() {

    var results: List<String>? = null

    override fun toString(): String {
        return "RHistoyDate{" +
                "error=" + error +
                ", results=" + results +
                '}'.toString()
    }
}
