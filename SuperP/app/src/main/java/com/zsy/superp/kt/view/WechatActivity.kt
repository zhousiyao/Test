package com.zsy.superp.kt.view

import android.R.attr.path
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.tencent.mm.opensdk.constants.ConstantsAPI
import com.tencent.mm.opensdk.modelbase.BaseResp
import com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram
import com.tencent.mm.opensdk.openapi.WXAPIFactory
import com.zsy.superp.R
import java.util.*


class WechatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wechat)
    }

    fun toWechat(view: View) {
        val appId = "wxd930ea5d5a258f4f" // 填移动应用(App)的 AppId，非小程序的 AppID

        val api = WXAPIFactory.createWXAPI(this, appId)

        val req = WXLaunchMiniProgram.Req()
        req.userName = "gh_d43f693ca31f" // 填小程序原始id

//        req.path = path ////拉起小程序页面的可带参路径，不填默认拉起小程序首页，对于小游戏，可以只传入 query 部分，来实现传参效果，如：传入 "?foo=bar"。

        req.miniprogramType = WXLaunchMiniProgram.Req.MINIPTOGRAM_TYPE_RELEASE // 可选打开 开发版，体验版和正式版

        api.sendReq(req)

    }
    fun onResp(resp: BaseResp) {
        if (resp.type == ConstantsAPI.COMMAND_LAUNCH_WX_MINIPROGRAM) {
            val launchMiniProResp = resp as WXLaunchMiniProgram.Resp
            val extraData =
                launchMiniProResp.extMsg //对应小程序组件 <button open-type="launchApp"> 中的 app-parameter 属性
        }
    }
}