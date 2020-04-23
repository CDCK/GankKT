package com.xlk.gank.model.data

/**
 * Created by xlk on 2020/4/23.
 *
 */
//    @GET("/data/category/Girl/type/Girl/page/1/count/10")
//    fun getBelle():Call<>
data class GirlInfo(
    val data: List<Data>,
    val page: Int,
    val page_count: Int,
    val status: Int,
    val total_counts: Int
)

data class Data(
    val _id: String,
    val author: String,
    val category: String,
    val createdAt: String,
    val desc: String,
    val images: List<String>,
    val likeCounts: Int,
    val publishedAt: String,
    val stars: Int,
    val title: String,
    val type: String,
    val url: String,
    val views: Int
)