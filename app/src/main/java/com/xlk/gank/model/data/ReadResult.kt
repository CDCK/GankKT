package com.xlk.gank.model.data

/**
 * Created by xlk on 2020/4/23.
 *
 */
class ReadResult{

    var data: DataBean? = null

    inner class DataBean(var date: DateBean?, var author: String?, var title: String?, var digest: String?, var content: String?, var wc: Int = 0) {
        inner class DateBean(var curr: String?, var prev: String?, var next: String?)
    }
}