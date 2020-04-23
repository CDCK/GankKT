package com.xlk.kotlingank.model


/**
 * Created by xlk on 2019/2/27.
 * 每一个的信息
 */
data class GankInfo(var _id: String?, var createdAt: String?, var desc: String?, var publishedAt: String?,
                    var source: String?, var type: String?, var url: String?, var isUsed: Boolean, var who: String?) : RGank() {

    override fun toString(): String {
        return "GankInfo{" +
                "_id='" + _id + '\''.toString() +
                ", createdAt='" + createdAt + '\''.toString() +
                ", desc='" + desc + '\''.toString() +
                ", publishedAt='" + publishedAt + '\''.toString() +
                ", source='" + source + '\''.toString() +
                ", type='" + type + '\''.toString() +
                ", url='" + url + '\''.toString() +
                ", used=" + isUsed +
                ", who='" + who + '\''.toString() +
                ", images=" + images +
                '}'.toString()
    }
}
