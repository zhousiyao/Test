package com.zsy.superp.kt.model

class ResultBean<T> {

    private var code: String? = null
    private var desc: String? = null
    private var data: T? = null
    private var success = false

    fun isSuccess(): Boolean {
        return success
    }

    fun setSuccess(success: Boolean) {
        this.success = success
    }

    fun getCode(): String? {
        return code
    }

    fun setCode(code: String?) {
        this.code = code
    }

    fun getDesc(): String? {
        return desc
    }

    fun setDesc(desc: String?) {
        this.desc = desc
    }

    fun getData(): T? {
        return data
    }

    fun setData(data: T?) {
        this.data = data
    }
}