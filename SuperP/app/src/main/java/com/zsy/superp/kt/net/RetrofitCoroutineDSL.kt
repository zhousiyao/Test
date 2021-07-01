package com.zsy.superp.kt.net

import com.zsy.superp.kt.model.ResultBean
import retrofit2.Call

class RetrofitCoroutineDSL<T> {

    var api: Call<ResultBean<T>>? = null

    internal var onSuccess:((T) -> Unit)? = null

    internal var onError:(() -> Unit)? = null


}