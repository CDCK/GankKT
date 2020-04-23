package com.xlk.kotlingank.http

import com.xlk.gank.model.data.GirlInfo
import com.xlk.gank.model.data.RandomGirl
import com.xlk.kotlingank.model.GankInfos
import com.xlk.kotlingank.model.RHistoryDayInfo
import com.xlk.kotlingank.model.RHistoyDate
import com.xlk.kotlingank.model.RToday
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.HTTP
import retrofit2.http.Path

/**
 * Created by xlk on 2019/4/23.
 *
 */
interface GankApi {
    companion object {
        val BASE_URL: String
            get() = "http://gank.io/api/v2/"
    }

    @GET(value = "today")
    fun getToday(): Call<RToday>

    /**
     * 获取指定类别中的数据 eg: http://gank.io/api/data/Android/10/1
     * @param catalogue 类型 eg:Android、IOS
     * @param page 页数
     */
    @GET(value = "data/{catalogue}/${10}/{page}")
    fun getCatalogue(@Path("catalogue") catalogue: String, @Path("page") page: Int): Call<GankInfos>

    /**
     * 获取指定日期的数据
     * @param date eg:"2015/02/15"
     */
    @HTTP(method = "GET", path = "day/{date}", hasBody = false)
    fun getDateInfo(@Path("date") date: String): Call<RToday>


    /**
     * 获取所有历史发布的日期
     */
    @GET("day/history")
    fun getHistoryDate(): Call<RHistoyDate>

    /**
     * 获取指定日期的历史数据
     * @param date 格式
     */
    @GET("history/content/day/{date}")
    fun getHistoryDateInfo(@Path("date") date: String): Call<RHistoryDayInfo>

    /**
     * 获取图片列表
     * @param page 页数
     * @param count 获取个数
     */
    @GET("data/category/Girl/type/Girl/page/{page}/count/{count}")
    fun getGirlInfo(@Path("page") page: Int, @Path("count") count: Int): Call<GirlInfo>

    /**
     * https://gank.io/api/v2/random/category/GanHuo/type/Android/count/10
     * category 可接受参数 Article | GanHuo | Girl
     * type 可接受参数 Android | iOS | Flutter | Girl，即分类API返回的类型数据
     * count: [1, 50]
     */
    @GET("random/category/Girl/type/Girl/count/1")
    fun getRandomGirl(): Call<RandomGirl>
}