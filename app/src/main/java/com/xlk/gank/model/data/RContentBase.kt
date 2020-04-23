package com.xlk.kotlingank.model

/**
 * Created by xlk on 2019/3/5.
 */
open class RContentBase {

    var _id: String? = null
    var content: String? = null
    var created_at: String? = null
    var publishedAt: String? = null
    var rand_id: String? = null
    var title: String? = null
    var updated_at: String? = null

    override fun toString(): String {
        return "RContentBase{" +
                "_id='" + _id + '\''.toString() +
                ", content='" + content + '\''.toString() +
                ", created_at='" + created_at + '\''.toString() +
                ", publishedAt='" + publishedAt + '\''.toString() +
                ", rand_id='" + rand_id + '\''.toString() +
                ", title='" + title + '\''.toString() +
                ", updated_at='" + updated_at + '\''.toString() +
                '}'.toString()
    }
}
