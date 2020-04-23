package com.xlk.kotlingank.http

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by xlk on 2019/4/23.
 *
 */
class RetrofitManager private constructor(baseurl:String){
    val baseurl = baseurl
    private var okhttp: OkHttpClient? = null
    private var retrofit: Retrofit? = null

    /**
     * kotlin中在 init代码块中进行初始化操作,类初始化时执行
     */
    init {
        okhttp = OkHttpClient.Builder().retryOnConnectionFailure(true).build()
    }

    companion object {
        @Volatile
        var instance: RetrofitManager? = null

        fun getInstance(baseurl: String): RetrofitManager {
            if (instance == null) {
                synchronized(RetrofitManager::class) {
                    if (instance == null) {
                        instance = RetrofitManager(baseurl)
                    }
                }
            }
            return instance!!
        }
    }

    fun <T> createApi(clz: Class<T>): T {
        if (retrofit == null) {
            retrofit = Retrofit.Builder().baseUrl(baseurl).client(okhttp)
                    .addConverterFactory(GsonConverterFactory.create()).build()
        }
        return retrofit!!.create(clz)
    }
}