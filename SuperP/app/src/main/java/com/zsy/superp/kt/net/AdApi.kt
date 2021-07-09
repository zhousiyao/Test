package com.zsy.superp.kt.net

import com.zsy.superp.kt.model.AdBean
import com.zsy.superp.kt.model.ResultBean
import retrofit2.Call
import retrofit2.http.FieldMap
import retrofit2.http.POST
import retrofit2.http.Query

interface AdApi {

    @POST("/index/sdk/serving")
    suspend fun serving(@FieldMap map: Map<String,String>): Call<ResultBean<AdBean>>
}