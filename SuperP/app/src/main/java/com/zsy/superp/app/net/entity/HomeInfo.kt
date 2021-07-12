package com.zsy.superp.app.net.entity

import java.io.Serializable

/**
 * 所有Entity类都在这里
 */

//首页信息
data class HomeInfo(var count:Int,
                    var total:Int,
                    var nextPageUrl:String?,
                    var data:Long,
                    var nextPublishTime:Long,
                    var topIssue:TopIssue, //顶部轮播内容
                    var refreshCount:Int,
                    var lastStartId:Int,
                    var itemList: MutableList<Content>) : Serializable
//顶部轮播内容
data class TopIssue(var type: String,
                    var data: TopIssueBean,
                    var tag: String) : Serializable

data class Content(var type: String,
                   var data: ContentBean,
                   var id: String,
                   var date: Long,
                   var tag: String) : Serializable

data class ContentBean(var dataType: String,
                       var header: Header?,
                       var follow: FollowInfo?,
                       var content: Content?,
                       var itemList: MutableList<Content>,
                       var id: String,
                       var title: String,
                       var description: String,
                       var library: String,
                       var tags: MutableList<TagsBean>,
                       var consumption: ConsumptionBean,
                       var image: String,
                       var resourceType: String,
                       var slogan: String,
                       var provider: ProviderBean,
                       var category: String,
                       var author: AuthorBean, //作者
                       var cover: CoverBean, //封面
                       var playUrl: String,
                       var thumbPlayUrl: String,
                       var duration: Int,
                       var webUrl: WebUrlBean,
                       var releaseTime: Long,
                       var playInfo: MutableList<PlayInfoBean>,
                       var campaign: String,
                       var waterMarks: String,
                       var type: String?,
                       var titlePgc: String,
                       var descriptionPgc: String,
                       var remark: String,
                       var idx: Int,
                       var shareAdTrack: String,
                       var favoriteAdTrack: String,
                       var webAdTrack: String,
                       var date: Long,
                       val label: Label?, //标签
                       var labelList: MutableList<*>,
                       var descriptionEditor: String,
                       var isCollected: Boolean,
                       var isPlayed: Boolean,
                       var subtitles: MutableList<*>,
                       var lastViewTime: String,
                       var playlists: String,
                       var text: String,
                       var icon: String,
                       var iconType: String,
                       var height: Int,
                       var src: Int,
                       var actionUrl: String?) : Serializable

data class Header(var id: String,
                  var title: String?,
                  var subTitle: String?,
                  var subTitleFont: String,
                  var textAlign: String?,
                  var font: String,
                  var cover: String,
                  var label: Any,
                  var actionUrl: String?,
                  var labelList: MutableList<*>,
                  var icon: String?,
                  var iconType: String,
                  var description: String?,
                  var follow: FollowInfo?,
                  var time: Long?) : Serializable

//关注信息
data class FollowInfo(var itemType: String,
                      var itemId: String,
                      var followed: Boolean) : Serializable

data class Label(var text: String,
                 var card: String,
                 var detail: String) : Serializable

/*------------------------------------------------------Bean------------------------------------------------------------------*/

//顶部轮播内容（详情）
data class TopIssueBean(var dataType: String,
                        var count: Int,
                        var itemList: MutableList<Content>) : Serializable

data class TagsBean(var id: Int,
                    var name: String,
                    var actionUrl: String,
                    var adTrack: String) : Serializable

data class ConsumptionBean(var collectionCount: String,
                           var shareCount: String,
                           var replyCount: String) : Serializable

data class ProviderBean(var name: String,
                        var alias: String,
                        var icon: String) : Serializable

data class AuthorBean(var id: String,
                      var icon: String,
                      var name: String,
                      var description: String,
                      var link: String,
                      var latestReleaseTime: Long,
                      var videoNum: Int,
                      var adTrack: String,
                      var follow: FollowInfo,
                      var shield: ShieldBean,
                      var approvedNotReadyVideoCount: Int,
                      var isIfPgc: Boolean = false) : Serializable

data class CoverBean(var feed: String,
                     var detail: String,
                     var blurred: String,
                     var sharing: String,
                     var homepage: String) : Serializable

data class WebUrlBean(var raw: String,
                      var forWeibo: String) : Serializable

data class PlayInfoBean(var height: Int,
                        var width: Int,
                        var name: String,
                        var type: String,
                        var url: String,
                        var urlList: MutableList<UrlListBean>) : Serializable

data class ShieldBean(
    var itemType: String,
    var itemId: Int,
    var isShielded: Boolean) : Serializable

data class UrlListBean(var name: String,
                       var url: String,
                       var size: Int) : Serializable