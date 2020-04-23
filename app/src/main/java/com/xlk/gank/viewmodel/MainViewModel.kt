package com.xlk.gank.viewmodel

import android.content.Context
import android.util.Log
import android.view.View
import androidx.databinding.ObservableField
import com.xlk.gank.model.data.GirlInfo
import com.xlk.gank.model.data.RandomGirl
import com.xlk.kotlingank.http.GankApi
import com.xlk.kotlingank.http.RetrofitManager
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * Created by xlk on 2020/4/23.
 *
 */
class MainViewModel(context: Context) {
    /** **** **  data  ** **** **/
    val content = ObservableField<String>("")

    /** **** **  binding  ** **** **/

    fun initial() {
        RetrofitManager.getInstance(GankApi.BASE_URL).createApi(GankApi::class.java)
            .getGirlInfo(1, 10)
            .enqueue(object : Callback<GirlInfo> {
                override fun onResponse(call: Call<GirlInfo>, response: Response<GirlInfo>) {
                    if (response.isSuccessful) {
                        val body = response.body()
                        body?.let {
                            Log.d(
                                "cdck",
                                "当前页：${body.page},总页数：${body.page_count}，总数据个数：${body.total_counts}"
                            )
                            content.set("当前页：${body.page},总页数：${body.page_count}，总数据个数：${body.total_counts}")
                        }
                    } else {
                        Log.e("cdck", "获取失败了")
                        content.set("")
                    }
                }

                override fun onFailure(call: Call<GirlInfo>, t: Throwable) {
                    Log.e("cdck", "onFailure失败了")
                }
            })
    }

    fun random() {
        RetrofitManager.getInstance(GankApi.BASE_URL).createApi(GankApi::class.java)
            .getRandomGirl()
            .enqueue(object : Callback<RandomGirl> {
                override fun onResponse(call: Call<RandomGirl>, response: Response<RandomGirl>) {
                    if(response.isSuccessful){
                        val body=response.body()
                        body?.let {
                            val datas =body.data
                        }
                    }
                }

                override fun onFailure(call: Call<RandomGirl>, t: Throwable) {

                }
            })
    }
}