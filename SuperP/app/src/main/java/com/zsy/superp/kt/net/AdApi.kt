package com.zsy.superp.kt.net

import com.zsy.superp.kt.model.AdBean
import com.zsy.superp.kt.model.ResultBean
import retrofit2.Call
import retrofit2.http.POST

interface AdApi {

    @POST("/index/sdk/serving")
    suspend fun serving(): Call<ResultBean<AdBean>>
}