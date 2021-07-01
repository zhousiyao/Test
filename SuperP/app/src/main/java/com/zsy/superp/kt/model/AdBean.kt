package com.zsy.superp.kt.model

class AdBean {
    //活动链接
    private var activityUrl: String? = null

    //图片素材
    private var imageUrl: String? = null

    // 素材ID
    private var sckId = 0

    // 素材尺寸:"640*150"
    private var size: String? = null

    //点击链接
    private var reportClickUrl: String? = null

    //曝光链接
    private var reportExposureUrl: String? = null

    //标题
    private var extTitle: String? = null

    //描述
    private var extDesc: String? = null

    //是否展示广告
    private var isSdkType = true

    //是否广告标志性可见
    private var isVisibleOfIcon = true

    //是否关闭按钮可见
    private var isVisibleOfCloseButton = true

    //广告位投放场景
    private var sceneType = 0

    //1=左文右图、2=上文下图、3=右文左图、4=三图
    private var specType = 0

    //展示动效类型 0-默认无变化
    private var theoryInteractiveType = 0

    //展示动效类型集合
    private var theoryInteractiveTypes: List<Int?>? = null

    //气泡图片地址（后期可拓展）
    private var textLinkBubbleUrl: String? = null

    fun getIconPlayInterval(): Int {
        return iconPlayInterval
    }

    fun setIconPlayInterval(iconPlayInterval: Int) {
        this.iconPlayInterval = iconPlayInterval
    }

    private var iconPlayInterval = 0

    private var isDownloadAd: Boolean? = null

//    private var advertSdkRsp: FoxBaseAdvertSdkRspBean? = null
//
//    private var sdkDsmLogRsp: FoxBaseSdkDsmLogRspBean? = null
//
//    fun getAdvertSdkRsp(): FoxBaseAdvertSdkRspBean? {
//        return advertSdkRsp
//    }
//
//    fun setAdvertSdkRsp(advertSdkRsp: FoxBaseAdvertSdkRspBean?) {
//        this.advertSdkRsp = advertSdkRsp
//    }
//
//    fun getSdkDsmLogRsp(): FoxBaseSdkDsmLogRspBean? {
//        return sdkDsmLogRsp
//    }
//
//    fun setSdkDsmLogRsp(sdkDsmLogRsp: FoxBaseSdkDsmLogRspBean?) {
//        this.sdkDsmLogRsp = sdkDsmLogRsp
//    }

    fun getDownloadAd(): Boolean? {
        return isDownloadAd
    }

    fun setDownloadAd(downloadAd: Boolean?) {
        isDownloadAd = downloadAd
    }

    //兼容信息流多图场景
    private var imageUrlList: List<String?>? = null

    fun getActivityUrl(): String? {
        return activityUrl
    }


    fun setActivityUrl(activityUrl: String?) {
        this.activityUrl = activityUrl
    }

    fun getImageUrl(): String? {
        return imageUrl
    }

    fun setImageUrl(imageUrl: String?) {
        this.imageUrl = imageUrl
    }

    fun getSckId(): Int {
        return sckId
    }

    fun setSckId(sckId: Int) {
        this.sckId = sckId
    }

    fun getSize(): String? {
        return size
    }

    fun setSize(size: String?) {
        this.size = size
    }

    fun getReportClickUrl(): String? {
        return reportClickUrl
    }

    fun setReportClickUrl(reportClickUrl: String?) {
        this.reportClickUrl = reportClickUrl
    }

    fun getReportExposureUrl(): String? {
        return reportExposureUrl
    }

    fun setReportExposureUrl(reportExposureUrl: String?) {
        this.reportExposureUrl = reportExposureUrl
    }

    fun getExtTitle(): String? {
        return extTitle
    }

    fun setExtTitle(extTitle: String?) {
        this.extTitle = extTitle
    }

    fun getExtDesc(): String? {
        return extDesc
    }

    fun setExtDesc(extDesc: String?) {
        this.extDesc = extDesc
    }

    fun isSdkType(): Boolean {
        return isSdkType
    }

    fun setSdkType(sdkType: Boolean) {
        isSdkType = sdkType
    }

    fun isVisibleOfIcon(): Boolean {
        return isVisibleOfIcon
    }

    fun setVisibleOfIcon(visibleOfIcon: Boolean) {
        isVisibleOfIcon = visibleOfIcon
    }

    fun isVisibleOfCloseButton(): Boolean {
        return isVisibleOfCloseButton
    }

    fun setVisibleOfCloseButton(visibleOfCloseButton: Boolean) {
        isVisibleOfCloseButton = visibleOfCloseButton
    }

    fun getImageUrlList(): List<String?>? {
        return imageUrlList
    }

    fun setImageUrlList(imageUrlList: List<String?>?) {
        this.imageUrlList = imageUrlList
    }

    fun getSceneType(): Int {
        return sceneType
    }

    fun setSceneType(sceneType: Int) {
        this.sceneType = sceneType
    }

    fun getSpecType(): Int {
        return specType
    }

    fun setSpecType(specType: Int) {
        this.specType = specType
    }

    fun getTheoryInteractiveType(): Int {
        return theoryInteractiveType
    }

    fun setTheoryInteractiveType(theoryInteractiveType: Int) {
        this.theoryInteractiveType = theoryInteractiveType
    }

    fun getTheoryInteractiveTypes(): List<Int?>? {
        return theoryInteractiveTypes
    }

    fun setTheoryInteractiveTypes(theoryInteractiveTypes: List<Int?>?) {
        this.theoryInteractiveTypes = theoryInteractiveTypes
    }

    fun getTextLinkBubbleUrl(): String? {
        return textLinkBubbleUrl
    }

    fun setTextLinkBubbleUrl(textLinkBubbleUrl: String?) {
        this.textLinkBubbleUrl = textLinkBubbleUrl
    }

}