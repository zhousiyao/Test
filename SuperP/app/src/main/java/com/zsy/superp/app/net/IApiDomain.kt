package com.zsy.superp.app.net

import com.zsy.superp.app.net.entity.HomeInfo
import io.reactivex.rxjava3.core.Flowable
import retrofit2.http.GET

interface IApiDomain {

    /**
     * 首页
     */
    @GET("api/v4/tabs/selected")
    fun getHomeInfo(): Flowable<HomeInfo>

    /**
     * 获取热门关键词
     */
    @GET("api/v3/queries/hot")
    fun getHotWord(): Flowable<MutableList<String>>

}