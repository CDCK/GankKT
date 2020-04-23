package com.xlk.kotlingank.model

import com.google.gson.annotations.SerializedName

/**
 * Created by xlk on 2019/2/27.
 */
class RToday : RBase() {

    var category: List<String>? = null
    var results: Result? = null

    inner class Result {
        @SerializedName("Android")
        var androidList: List<GankInfo>? = null
        @SerializedName("休息视频")
        var restList: List<GankInfo>? = null
        @SerializedName("iOS")
        var iOSList: List<GankInfo>? = null
        @SerializedName("福利")
        var belleList: List<GankInfo>? = null
        @SerializedName("拓展资源")
        var expandList: List<GankInfo>? = null
        @SerializedName("瞎推荐")
        var recommendList: List<GankInfo>? = null
        @SerializedName("App")
        var appList: List<GankInfo>? = null
        @SerializedName("前端")
        var frontList: List<GankInfo>? = null

    }

    override fun toString(): String {
        return "RToday{" +
                "category=" + category +
                ", results=" + results +
                '}'.toString()
    }
}
