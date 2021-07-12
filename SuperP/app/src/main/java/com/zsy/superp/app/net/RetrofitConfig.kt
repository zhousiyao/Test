package com.zsy.superp.app.net

import com.google.gson.GsonBuilder
import com.google.gson.internal.GsonBuildConfig
import com.zsy.superp.app.global.BaseApplication
import io.reactivex.rxjava3.internal.schedulers.RxThreadFactory
import io.reactivex.rxjava3.plugins.RxJavaPlugins
import okhttp3.Cache
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

class RetrofitConfig private constructor(){

    private lateinit var mDefaultInterceptor:Interceptor
    private lateinit var mHttpLoggingInterceptor: HttpLoggingInterceptor //日志拦截器
    private lateinit var mOkHttpClient: OkHttpClient
    private lateinit var mCache: Cache
    private lateinit var mRetrofit:Retrofit

    companion object{
        //单例
        private val mInstance:RetrofitConfig by lazy{ RetrofitConfig() }
        private const val READ_TIME_OUT = 5000L //读取超时5（单位：秒）
        private const val WRITE_TIME_OUT = 5000L //写入超时5（单位：秒）
        private const val DEFAULT_CACHE_SIZE = 1024 * 1024 * 100L //缓存大小100Mb

        @JvmStatic
        fun getApiService(): IApiDomain{
            return mInstance.apiService
        }
    }

    private lateinit var apiService:IApiDomain

    init {
        //初始化
        initRequestInterceptor()
        initLoggingInterceptor()
        initCache()
        initOkHttpClient()
        initRetrofit()

    }

    private fun initRetrofit() {
        val gson = GsonBuilder().setDateFormat("yyyy-MM-dd hh:mm:ss").create()
        mRetrofit = Retrofit.Builder()
            .client(mOkHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
            .baseUrl(BaseApi.BASE_URL)
            .build()
    }

    private fun initOkHttpClient() {
        mOkHttpClient = OkHttpClient().newBuilder()
            .readTimeout(READ_TIME_OUT,TimeUnit.MILLISECONDS)
            .writeTimeout(WRITE_TIME_OUT,TimeUnit.MILLISECONDS)
            .addInterceptor(mDefaultInterceptor)
            .addInterceptor(mHttpLoggingInterceptor)
            .cache(mCache)
            .build()
    }

    private fun initCache() {
        val cacheFile = File(BaseApplication.INSTANCE.cacheDir,"cache")
        mCache = Cache(cacheFile,DEFAULT_CACHE_SIZE)
    }

    /**
     * 日志拦截器
     */
    private fun initLoggingInterceptor() {
        mHttpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    /**
     * 初始化请求拦截器
     */
    private fun initRequestInterceptor() {
        mDefaultInterceptor = Interceptor {
            //配置全局请求参数
            chain ->
                val urlBuild = chain.request().url()
                                .newBuilder()
                                .setEncodedQueryParameter("udid", "d0f6190461864a3a978bdbcb3fe9b48709f1f390")
                                .setEncodedQueryParameter("vc", "225")
                                .setEncodedQueryParameter("vn", "3.12.0")
                                .setEncodedQueryParameter("deviceModel", "Redmi%204")
                                .setEncodedQueryParameter("first_channel", "eyepetizer_xiaomi_market")
                                .setEncodedQueryParameter("last_channel", "eyepetizer_xiaomi_market")
                                .setEncodedQueryParameter("system_version_code", "23")
                val request = chain.request().newBuilder()
                                .addHeader("Content-Type", "application/json")
                                .addHeader("Cookie", "ky_auth=;sdk=23")
                                .addHeader("model", "Android")
                                .url(urlBuild.build())
                                .build()

                chain.proceed(request)
        }
    }

}