package com.soyoungboy.sample.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/4/17.
 */

public class Topic implements Serializable {

    private DataBeanXXX data;
    private int errcode;
    private String errmsg;
    private boolean ret;
    private int server_time;
    private String sign;
    private String ver;


    public DataBeanXXX getData() { return data;}


    public void setData(DataBeanXXX data) { this.data = data;}


    public int getErrcode() { return errcode;}


    public void setErrcode(int errcode) { this.errcode = errcode;}


    public String getErrmsg() { return errmsg;}


    public void setErrmsg(String errmsg) { this.errmsg = errmsg;}


    public boolean isRet() { return ret;}


    public void setRet(boolean ret) { this.ret = ret;}


    public int getServer_time() { return server_time;}


    public void setServer_time(int server_time) { this.server_time = server_time;}


    public String getSign() { return sign;}


    public void setSign(String sign) { this.sign = sign;}


    public String getVer() { return ver;}


    public void setVer(String ver) { this.ver = ver;}


    public static class DataBeanXXX {

        private int count;
        private SpecialDynamicsLayoutBean specialDynamicsLayout;
        private TopicListInfoLayoutBean topicListInfoLayout;
        private VideoLayoutBean videoLayout;


        public int getCount() { return count;}


        public void setCount(int count) { this.count = count;}


        public SpecialDynamicsLayoutBean getSpecialDynamicsLayout() { return specialDynamicsLayout;}


        public void setSpecialDynamicsLayout(SpecialDynamicsLayoutBean specialDynamicsLayout) {
            this.specialDynamicsLayout = specialDynamicsLayout;
        }


        public TopicListInfoLayoutBean getTopicListInfoLayout() { return topicListInfoLayout;}


        public void setTopicListInfoLayout(TopicListInfoLayoutBean topicListInfoLayout) {
            this.topicListInfoLayout = topicListInfoLayout;
        }


        public VideoLayoutBean getVideoLayout() { return videoLayout;}


        public void setVideoLayout(VideoLayoutBean videoLayout) { this.videoLayout = videoLayout;}


        public static class SpecialDynamicsLayoutBean {

            private int seq;
            private String title;
            private List<DataBean> data;


            public int getSeq() { return seq;}


            public void setSeq(int seq) { this.seq = seq;}


            public String getTitle() { return title;}


            public void setTitle(String title) { this.title = title;}


            public List<DataBean> getData() { return data;}


            public void setData(List<DataBean> data) { this.data = data;}


            public static class DataBean {

                private int activityId;
                private int choiceFlg;
                private long choiceTime;
                private int clubId;
                private long createTime;
                private int dynamicType;
                private int id;
                private int isFollow;
                private boolean isNowAll;
                private int isPraise;
                private String nickName;
                private int picOrVideo;
                private int releaseType;
                private String reportAddress;
                private RespDynamicDetailTextBean respDynamicDetailText;
                private String shareUrl;
                private int sumDynamicComments;
                private int sumPraises;
                private int topicId;
                private String topicName;
                private int type;
                private int uid;
                private UserIconBean userIcon;
                private List<?> dynamicComments;
                private List<ImagesBean> images;
                private List<PraisesBean> praises;


                public int getActivityId() { return activityId;}


                public void setActivityId(int activityId) { this.activityId = activityId;}


                public int getChoiceFlg() { return choiceFlg;}


                public void setChoiceFlg(int choiceFlg) { this.choiceFlg = choiceFlg;}


                public long getChoiceTime() { return choiceTime;}


                public void setChoiceTime(long choiceTime) { this.choiceTime = choiceTime;}


                public int getClubId() { return clubId;}


                public void setClubId(int clubId) { this.clubId = clubId;}


                public long getCreateTime() { return createTime;}


                public void setCreateTime(long createTime) { this.createTime = createTime;}


                public int getDynamicType() { return dynamicType;}


                public void setDynamicType(int dynamicType) { this.dynamicType = dynamicType;}


                public int getId() { return id;}


                public void setId(int id) { this.id = id;}


                public int getIsFollow() { return isFollow;}


                public void setIsFollow(int isFollow) { this.isFollow = isFollow;}


                public boolean isIsNowAll() { return isNowAll;}


                public void setIsNowAll(boolean isNowAll) { this.isNowAll = isNowAll;}


                public int getIsPraise() { return isPraise;}


                public void setIsPraise(int isPraise) { this.isPraise = isPraise;}


                public String getNickName() { return nickName;}


                public void setNickName(String nickName) { this.nickName = nickName;}


                public int getPicOrVideo() { return picOrVideo;}


                public void setPicOrVideo(int picOrVideo) { this.picOrVideo = picOrVideo;}


                public int getReleaseType() { return releaseType;}


                public void setReleaseType(int releaseType) { this.releaseType = releaseType;}


                public String getReportAddress() { return reportAddress;}


                public void setReportAddress(String reportAddress) {
                    this.reportAddress = reportAddress;
                }


                public RespDynamicDetailTextBean getRespDynamicDetailText() { return respDynamicDetailText;}


                public void setRespDynamicDetailText(RespDynamicDetailTextBean respDynamicDetailText) {
                    this.respDynamicDetailText = respDynamicDetailText;
                }


                public String getShareUrl() { return shareUrl;}


                public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}


                public int getSumDynamicComments() { return sumDynamicComments;}


                public void setSumDynamicComments(int sumDynamicComments) {
                    this.sumDynamicComments = sumDynamicComments;
                }


                public int getSumPraises() { return sumPraises;}


                public void setSumPraises(int sumPraises) { this.sumPraises = sumPraises;}


                public int getTopicId() { return topicId;}


                public void setTopicId(int topicId) { this.topicId = topicId;}


                public String getTopicName() { return topicName;}


                public void setTopicName(String topicName) { this.topicName = topicName;}


                public int getType() { return type;}


                public void setType(int type) { this.type = type;}


                public int getUid() { return uid;}


                public void setUid(int uid) { this.uid = uid;}


                public UserIconBean getUserIcon() { return userIcon;}


                public void setUserIcon(UserIconBean userIcon) { this.userIcon = userIcon;}


                public List<?> getDynamicComments() { return dynamicComments;}


                public void setDynamicComments(List<?> dynamicComments) {
                    this.dynamicComments = dynamicComments;
                }


                public List<ImagesBean> getImages() { return images;}


                public void setImages(List<ImagesBean> images) { this.images = images;}


                public List<PraisesBean> getPraises() { return praises;}


                public void setPraises(List<PraisesBean> praises) { this.praises = praises;}


                public static class RespDynamicDetailTextBean {
                    /**
                     * content : 哈哈哈哈哈哈
                     * id : 0
                     */

                    private String content;
                    private int id;


                    public String getContent() { return content;}


                    public void setContent(String content) { this.content = content;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}
                }


                public static class UserIconBean {
                    /**
                     * height : 0
                     * id : 0
                     * imageUrl : https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg
                     * isMain : 0
                     * isVideo : false
                     * state : 1
                     * thumbnailUrl : https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg
                     * width : 0
                     */

                    private int height;
                    private int id;
                    private String imageUrl;
                    private int isMain;
                    private boolean isVideo;
                    private int state;
                    private String thumbnailUrl;
                    private int width;


                    public int getHeight() { return height;}


                    public void setHeight(int height) { this.height = height;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public String getImageUrl() { return imageUrl;}


                    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                    public int getIsMain() { return isMain;}


                    public void setIsMain(int isMain) { this.isMain = isMain;}


                    public boolean isIsVideo() { return isVideo;}


                    public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                    public int getState() { return state;}


                    public void setState(int state) { this.state = state;}


                    public String getThumbnailUrl() { return thumbnailUrl;}


                    public void setThumbnailUrl(String thumbnailUrl) {
                        this.thumbnailUrl = thumbnailUrl;
                    }


                    public int getWidth() { return width;}


                    public void setWidth(int width) { this.width = width;}
                }


                public static class ImagesBean {
                    /**
                     * height : 439
                     * id : 491
                     * imageUrl : http://quncao-app.b0.upaiyun.com/8v22beoa8wiimubru3lu63cr06h8pute.jpg
                     * isMain : 0
                     * isVideo : false
                     * state : 1
                     * thumbnailUrl :
                     * width : 658
                     */

                    private int height;
                    private int id;
                    private String imageUrl;
                    private int isMain;
                    private boolean isVideo;
                    private int state;
                    private String thumbnailUrl;
                    private int width;


                    public int getHeight() { return height;}


                    public void setHeight(int height) { this.height = height;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public String getImageUrl() { return imageUrl;}


                    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                    public int getIsMain() { return isMain;}


                    public void setIsMain(int isMain) { this.isMain = isMain;}


                    public boolean isIsVideo() { return isVideo;}


                    public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                    public int getState() { return state;}


                    public void setState(int state) { this.state = state;}


                    public String getThumbnailUrl() { return thumbnailUrl;}


                    public void setThumbnailUrl(String thumbnailUrl) {
                        this.thumbnailUrl = thumbnailUrl;
                    }


                    public int getWidth() { return width;}


                    public void setWidth(int width) { this.width = width;}
                }


                public static class PraisesBean {
                    /**
                     * id : 383
                     * isFollow : 0
                     * isFriend : 0
                     * user : {"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"province_id":0,"uid":59}
                     */

                    private int id;
                    private int isFollow;
                    private int isFriend;
                    private UserBean user;


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public int getIsFollow() { return isFollow;}


                    public void setIsFollow(int isFollow) { this.isFollow = isFollow;}


                    public int getIsFriend() { return isFriend;}


                    public void setIsFriend(int isFriend) { this.isFriend = isFriend;}


                    public UserBean getUser() { return user;}


                    public void setUser(UserBean user) { this.user = user;}


                    public static class UserBean {
                        /**
                         * area_id : 0
                         * gender : 0
                         * icon : {"height":0,"id":0,"imageUrl":"","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0}
                         * is_verify_mobile : 0
                         * province_id : 0
                         * uid : 59
                         */

                        private int area_id;
                        private int gender;
                        private IconBean icon;
                        private int is_verify_mobile;
                        private int province_id;
                        private int uid;


                        public int getArea_id() { return area_id;}


                        public void setArea_id(int area_id) { this.area_id = area_id;}


                        public int getGender() { return gender;}


                        public void setGender(int gender) { this.gender = gender;}


                        public IconBean getIcon() { return icon;}


                        public void setIcon(IconBean icon) { this.icon = icon;}


                        public int getIs_verify_mobile() { return is_verify_mobile;}


                        public void setIs_verify_mobile(int is_verify_mobile) {
                            this.is_verify_mobile = is_verify_mobile;
                        }


                        public int getProvince_id() { return province_id;}


                        public void setProvince_id(int province_id) {
                            this.province_id = province_id;
                        }


                        public int getUid() { return uid;}


                        public void setUid(int uid) { this.uid = uid;}


                        public static class IconBean {
                            /**
                             * height : 0
                             * id : 0
                             * imageUrl :
                             * isMain : 0
                             * isVideo : false
                             * state : 1
                             * thumbnailUrl :
                             * width : 0
                             */

                            private int height;
                            private int id;
                            private String imageUrl;
                            private int isMain;
                            private boolean isVideo;
                            private int state;
                            private String thumbnailUrl;
                            private int width;


                            public int getHeight() { return height;}


                            public void setHeight(int height) { this.height = height;}


                            public int getId() { return id;}


                            public void setId(int id) { this.id = id;}


                            public String getImageUrl() { return imageUrl;}


                            public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                            public int getIsMain() { return isMain;}


                            public void setIsMain(int isMain) { this.isMain = isMain;}


                            public boolean isIsVideo() { return isVideo;}


                            public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                            public int getState() { return state;}


                            public void setState(int state) { this.state = state;}


                            public String getThumbnailUrl() { return thumbnailUrl;}


                            public void setThumbnailUrl(String thumbnailUrl) {
                                this.thumbnailUrl = thumbnailUrl;
                            }


                            public int getWidth() { return width;}


                            public void setWidth(int width) { this.width = width;}
                        }
                    }
                }
            }
        }


        public static class TopicListInfoLayoutBean {
            /**
             * data : [{"pep_total":25,"reply_total":76,"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=74","topic":{"content":"天若有情天亦老，人间正道是衰老","create_time":1488868525,"editor":"admin","id":74,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2PVNNG3BC.jpg","name":"人间正道是沧桑","recomm_flg":1,"recomm_time":1490058883,"show_flg":1},"totalCountHot":162},{"pep_total":12,"reply_total":15,"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=59","topic":{"content":"鸟蛋是百灵鸟王国通用的货币，\n10鸟蛋=1RMB\n每天都有机会掏鸟蛋\n拥有鸟蛋最多的人\n就是小鸟君心中的白富美or高富帅\n赶快来晒出\n今天你一爪子掏到了几个鸟蛋？\n","create_time":1484638547,"editor":"admin","id":59,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2PU1ELF7B.jpg","name":"鸟蛋日志","recomm_flg":1,"recomm_time":1488441983,"show_flg":1},"totalCountHot":67},{"pep_total":49,"reply_total":90,"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=47","topic":{"content":"有颜不是万能的，会打球又有颜却是无所不能的。如果你和你的胖友就是这样的高能物种，赶紧列队吧！这里有很多同类啊喂！","create_time":1481074584,"editor":"yanglinxuan","id":47,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2L8LUW60A.jpg","name":"球技一流，颜值爆表","recomm_flg":1,"recomm_time":1481074589,"show_flg":1},"totalCountHot":196},{"pep_total":10,"reply_total":14,"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=60","topic":{"content":"每天早起第一件事，想让ta第一个收到早安\n偷偷翻看ta的动态，昨天ta去哪运动了？\n晒一张晨起锻炼的照片，提醒ta\n爱，就是让自己变得更好\n情人节，\n想带ta一起街边晨跑 、午夜狂奔、球馆挥汗如雨\n你想带ta去哪运动呢？\n别害羞，有爱的声音值得和我们分享！\n\n为了奖励勤勤恳恳参与话题的宝宝们，小鸟君特别设置了三个奖励哦！\n（截至2月17日中午12:00）\n最佳人气奖：当周吸引互动最多的动态（点赞+评论）=价值20元场馆优惠券\n最活跃奖：参与话题当周有效动态数最多（与话题真实相关）=100鸟蛋\n参与奖：小鸟君又任性了，参与就奖10鸟蛋！（每日限领一次）\n\n","create_time":1486363220,"editor":"admin","id":60,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2ODZ2NA3C.jpg","name":"情人节带ta去运动","recomm_flg":1,"recomm_time":1486363226,"show_flg":1},"totalCountHot":35},{"pep_total":5,"reply_total":53,"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=61","topic":{"content":"还记得运动时被朋友强行抓拍的囧照吗？\n一直珍藏在相册中舍不得删\n我只想说，不要逼我相认，\n这个表情包一定不是我......\n独乐乐不如众乐乐\n大胆晒出自己或朋友的运动囧照吧\n","create_time":1486366752,"editor":"admin","id":61,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2OE1J2549.png","name":"运动囧照","recomm_flg":1,"recomm_time":1486366756,"show_flg":1},"totalCountHot":166}]
             * seq : 1
             * title : 精选话题
             */

            private int seq;
            private String title;
            private List<DataBeanX> data;


            public int getSeq() { return seq;}


            public void setSeq(int seq) { this.seq = seq;}


            public String getTitle() { return title;}


            public void setTitle(String title) { this.title = title;}


            public List<DataBeanX> getData() { return data;}


            public void setData(List<DataBeanX> data) { this.data = data;}


            public static class DataBeanX {
                /**
                 * pep_total : 25
                 * reply_total : 76
                 * shareUrl : http://betaweixin.quncaotech.com/h5/activity/theme_index.html?topicId=74
                 * topic : {"content":"天若有情天亦老，人间正道是衰老","create_time":1488868525,"editor":"admin","id":74,"img_url":"http://quncao.b0.upaiyun.com/dynamic/F2PVNNG3BC.jpg","name":"人间正道是沧桑","recomm_flg":1,"recomm_time":1490058883,"show_flg":1}
                 * totalCountHot : 162
                 */

                private int pep_total;
                private int reply_total;
                private String shareUrl;
                private TopicBean topic;
                private int totalCountHot;


                public int getPep_total() { return pep_total;}


                public void setPep_total(int pep_total) { this.pep_total = pep_total;}


                public int getReply_total() { return reply_total;}


                public void setReply_total(int reply_total) { this.reply_total = reply_total;}


                public String getShareUrl() { return shareUrl;}


                public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}


                public TopicBean getTopic() { return topic;}


                public void setTopic(TopicBean topic) { this.topic = topic;}


                public int getTotalCountHot() { return totalCountHot;}


                public void setTotalCountHot(int totalCountHot) {
                    this.totalCountHot = totalCountHot;
                }


                public static class TopicBean {
                    /**
                     * content : 天若有情天亦老，人间正道是衰老
                     * create_time : 1488868525
                     * editor : admin
                     * id : 74
                     * img_url : http://quncao.b0.upaiyun.com/dynamic/F2PVNNG3BC.jpg
                     * name : 人间正道是沧桑
                     * recomm_flg : 1
                     * recomm_time : 1490058883
                     * show_flg : 1
                     */

                    private String content;
                    private int create_time;
                    private String editor;
                    private int id;
                    private String img_url;
                    private String name;
                    private int recomm_flg;
                    private int recomm_time;
                    private int show_flg;


                    public String getContent() { return content;}


                    public void setContent(String content) { this.content = content;}


                    public int getCreate_time() { return create_time;}


                    public void setCreate_time(int create_time) { this.create_time = create_time;}


                    public String getEditor() { return editor;}


                    public void setEditor(String editor) { this.editor = editor;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public String getImg_url() { return img_url;}


                    public void setImg_url(String img_url) { this.img_url = img_url;}


                    public String getName() { return name;}


                    public void setName(String name) { this.name = name;}


                    public int getRecomm_flg() { return recomm_flg;}


                    public void setRecomm_flg(int recomm_flg) { this.recomm_flg = recomm_flg;}


                    public int getRecomm_time() { return recomm_time;}


                    public void setRecomm_time(int recomm_time) { this.recomm_time = recomm_time;}


                    public int getShow_flg() { return show_flg;}


                    public void setShow_flg(int show_flg) { this.show_flg = show_flg;}
                }
            }
        }


        public static class VideoLayoutBean {
            /**
             * data : [{"activityId":0,"choiceFlg":0,"choiceTime":0,"clubId":0,"createTime":1490180649000,"dynamicComments":[{"content":"记得记得觉得我","createTime":1490424644000,"dynamicDetailsId":37373,"id":673,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"啦啦啦啦啦","createTime":1490424633000,"dynamicDetailsId":37373,"id":672,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"啊啊","createTime":1490424626000,"dynamicDetailsId":37373,"id":671,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}}],"dynamicType":0,"id":37373,"images":[],"isFollow":0,"isNowAll":false,"isPraise":0,"nickName":"娜娜","picOrVideo":0,"praises":[{"id":640,"isFollow":0,"isFriend":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"province_id":0,"uid":55}}],"releaseType":0,"respVideo":{"brief":"视屏验证小组赛","businessId":0,"categoryName":"足球","duration":42,"id":25,"imageUrl":"http://quncao.b0.upaiyun.com/dynamic/F2QNSJWAFD.jpg","labelNames":["我最美","啊实打实大安师大安师"],"pv":22050,"title":"运营题材验证","uid":9090588,"videoUrl":"http://daren-10061568.video.myqcloud.com/1703/1135F2QOXY49BB.mp4"},"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/active-details.html?dynamicId=37373","sumDynamicComments":6,"sumPraises":1,"topicId":0,"topicName":"","type":0,"uid":9090588,"userIcon":{"height":0,"id":0,"imageUrl":"http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4","width":0}},{"activityId":0,"choiceFlg":0,"choiceTime":0,"clubId":0,"createTime":1490180457000,"dynamicComments":[{"content":"巴黎旅途","createTime":1490267973000,"dynamicDetailsId":37370,"id":645,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"啦啦啊","createTime":1490267965000,"dynamicDetailsId":37370,"id":644,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"太丰富","createTime":1490267934000,"dynamicDetailsId":37370,"id":642,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}}],"dynamicType":0,"id":37370,"images":[],"isFollow":0,"isNowAll":false,"isPraise":0,"nickName":"xjgcycyvuctcgchcu故意雨uv12345678","picOrVideo":0,"praises":[],"releaseType":0,"respVideo":{"brief":"测试资源大的视频能不能上传","businessId":0,"categoryName":"足球","duration":167,"id":24,"imageUrl":"http://quncao.b0.upaiyun.com/dynamic/F2QNS4EB5C.jpg","labelNames":[null,null],"pv":94,"title":"测试运营视频","uid":9090570,"videoUrl":"http://daren-10061568.video.myqcloud.com/1703/1101F2QOXQ64D6.mp4"},"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/active-details.html?dynamicId=37370","sumDynamicComments":6,"sumPraises":0,"topicId":0,"topicName":"","type":0,"uid":9090570,"userIcon":{"height":0,"id":0,"imageUrl":"http://quncao-app.b0.upaiyun.com/nadg7cv7cj8wid3nevbknfbvqochwsr4","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao-app.b0.upaiyun.com/nadg7cv7cj8wid3nevbknfbvqochwsr4","width":0}},{"activityId":0,"choiceFlg":0,"choiceTime":0,"clubId":0,"createTime":1489484790000,"dynamicComments":[{"content":"dddd","createTime":1490094924000,"dynamicDetailsId":37163,"id":542,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"http://quncao.b0.upaiyun.com/user/icon/default_avatar.png","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao.b0.upaiyun.com/user/icon/default_avatar.png","width":0},"is_verify_mobile":0,"nick_name":"Match","province_id":0,"uid":9090897}},{"content":"gxgxyyd","createTime":1490094450000,"dynamicDetailsId":37163,"id":541,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"http://quncao-app.b0.upaiyun.com/r5yvw29eowdf4akuwghy8s98t0x903q2","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao-app.b0.upaiyun.com/r5yvw29eowdf4akuwghy8s98t0x903q2","width":0},"is_verify_mobile":0,"nick_name":"189*0854","province_id":0,"uid":9090576}},{"content":"hvuvuvyc","createTime":1490094431000,"dynamicDetailsId":37163,"id":540,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"http://quncao-app.b0.upaiyun.com/r5yvw29eowdf4akuwghy8s98t0x903q2","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao-app.b0.upaiyun.com/r5yvw29eowdf4akuwghy8s98t0x903q2","width":0},"is_verify_mobile":0,"nick_name":"189*0854","province_id":0,"uid":9090576}}],"dynamicType":0,"id":37163,"images":[],"isFollow":0,"isNowAll":false,"isPraise":0,"nickName":"xjgcycyvuctcgchcu故意雨uv12345678","picOrVideo":0,"praises":[],"releaseType":0,"respVideo":{"brief":"氨基酸的哈克稍等哈可接受的哈开始的氨基酸等哈说会计的哈开始接单哈可接受的加深对甲磺酸多金卡后视镜肯定会大数据肯定会啊可接受的加深对甲磺酸多金卡和四大皆空安徽的会计哈是可敬的哈开始定金哈克斯觉得好熬枯受淡加厚123456789","businessId":0,"categoryName":"装备","duration":8,"id":15,"imageUrl":"http://quncao.b0.upaiyun.com/dynamic/F2Q8V56585.jpg","labelNames":["111111"],"pv":222,"title":"测试123","uid":9090570,"videoUrl":"http://daren-10061568.video.myqcloud.com/1703/1701F2Q8V8WCCC.mp4"},"shareUrl":"http://betaweixin.quncaotech.com/h5/activity/active-details.html?dynamicId=37163","sumDynamicComments":4,"sumPraises":0,"topicId":0,"topicName":"","type":0,"uid":9090570,"userIcon":{"height":0,"id":0,"imageUrl":"http://quncao-app.b0.upaiyun.com/nadg7cv7cj8wid3nevbknfbvqochwsr4","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao-app.b0.upaiyun.com/nadg7cv7cj8wid3nevbknfbvqochwsr4","width":0}}]
             * seq : 2
             * title : 精选视频
             */

            private int seq;
            private String title;
            private List<DataBeanXX> data;


            public int getSeq() { return seq;}


            public void setSeq(int seq) { this.seq = seq;}


            public String getTitle() { return title;}


            public void setTitle(String title) { this.title = title;}


            public List<DataBeanXX> getData() { return data;}


            public void setData(List<DataBeanXX> data) { this.data = data;}


            public static class DataBeanXX {
                /**
                 * activityId : 0
                 * choiceFlg : 0
                 * choiceTime : 0
                 * clubId : 0
                 * createTime : 1490180649000
                 * dynamicComments : [{"content":"记得记得觉得我","createTime":1490424644000,"dynamicDetailsId":37373,"id":673,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"啦啦啦啦啦","createTime":1490424633000,"dynamicDetailsId":37373,"id":672,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}},{"content":"啊啊","createTime":1490424626000,"dynamicDetailsId":37373,"id":671,"toUser":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0},"type":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}}]
                 * dynamicType : 0
                 * id : 37373
                 * images : []
                 * isFollow : 0
                 * isNowAll : false
                 * isPraise : 0
                 * nickName : 娜娜
                 * picOrVideo : 0
                 * praises : [{"id":640,"isFollow":0,"isFriend":0,"user":{"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"province_id":0,"uid":55}}]
                 * releaseType : 0
                 * respVideo : {"brief":"视屏验证小组赛","businessId":0,"categoryName":"足球","duration":42,"id":25,"imageUrl":"http://quncao.b0.upaiyun.com/dynamic/F2QNSJWAFD.jpg","labelNames":["我最美","啊实打实大安师大安师"],"pv":22050,"title":"运营题材验证","uid":9090588,"videoUrl":"http://daren-10061568.video.myqcloud.com/1703/1135F2QOXY49BB.mp4"}
                 * shareUrl : http://betaweixin.quncaotech.com/h5/activity/active-details.html?dynamicId=37373
                 * sumDynamicComments : 6
                 * sumPraises : 1
                 * topicId : 0
                 * topicName :
                 * type : 0
                 * uid : 9090588
                 * userIcon : {"height":0,"id":0,"imageUrl":"http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4","width":0}
                 */

                private int activityId;
                private int choiceFlg;
                private int choiceTime;
                private int clubId;
                private long createTime;
                private int dynamicType;
                private int id;
                private int isFollow;
                private boolean isNowAll;
                private int isPraise;
                private String nickName;
                private int picOrVideo;
                private int releaseType;
                private RespVideoBean respVideo;
                private String shareUrl;
                private int sumDynamicComments;
                private int sumPraises;
                private int topicId;
                private String topicName;
                private int type;
                private int uid;
                private UserIconBeanX userIcon;
                private List<DynamicCommentsBean> dynamicComments;
                private List<?> images;
                private List<PraisesBeanX> praises;


                public int getActivityId() { return activityId;}


                public void setActivityId(int activityId) { this.activityId = activityId;}


                public int getChoiceFlg() { return choiceFlg;}


                public void setChoiceFlg(int choiceFlg) { this.choiceFlg = choiceFlg;}


                public int getChoiceTime() { return choiceTime;}


                public void setChoiceTime(int choiceTime) { this.choiceTime = choiceTime;}


                public int getClubId() { return clubId;}


                public void setClubId(int clubId) { this.clubId = clubId;}


                public long getCreateTime() { return createTime;}


                public void setCreateTime(long createTime) { this.createTime = createTime;}


                public int getDynamicType() { return dynamicType;}


                public void setDynamicType(int dynamicType) { this.dynamicType = dynamicType;}


                public int getId() { return id;}


                public void setId(int id) { this.id = id;}


                public int getIsFollow() { return isFollow;}


                public void setIsFollow(int isFollow) { this.isFollow = isFollow;}


                public boolean isIsNowAll() { return isNowAll;}


                public void setIsNowAll(boolean isNowAll) { this.isNowAll = isNowAll;}


                public int getIsPraise() { return isPraise;}


                public void setIsPraise(int isPraise) { this.isPraise = isPraise;}


                public String getNickName() { return nickName;}


                public void setNickName(String nickName) { this.nickName = nickName;}


                public int getPicOrVideo() { return picOrVideo;}


                public void setPicOrVideo(int picOrVideo) { this.picOrVideo = picOrVideo;}


                public int getReleaseType() { return releaseType;}


                public void setReleaseType(int releaseType) { this.releaseType = releaseType;}


                public RespVideoBean getRespVideo() { return respVideo;}


                public void setRespVideo(RespVideoBean respVideo) { this.respVideo = respVideo;}


                public String getShareUrl() { return shareUrl;}


                public void setShareUrl(String shareUrl) { this.shareUrl = shareUrl;}


                public int getSumDynamicComments() { return sumDynamicComments;}


                public void setSumDynamicComments(int sumDynamicComments) {
                    this.sumDynamicComments = sumDynamicComments;
                }


                public int getSumPraises() { return sumPraises;}


                public void setSumPraises(int sumPraises) { this.sumPraises = sumPraises;}


                public int getTopicId() { return topicId;}


                public void setTopicId(int topicId) { this.topicId = topicId;}


                public String getTopicName() { return topicName;}


                public void setTopicName(String topicName) { this.topicName = topicName;}


                public int getType() { return type;}


                public void setType(int type) { this.type = type;}


                public int getUid() { return uid;}


                public void setUid(int uid) { this.uid = uid;}


                public UserIconBeanX getUserIcon() { return userIcon;}


                public void setUserIcon(UserIconBeanX userIcon) { this.userIcon = userIcon;}


                public List<DynamicCommentsBean> getDynamicComments() { return dynamicComments;}


                public void setDynamicComments(List<DynamicCommentsBean> dynamicComments) {
                    this.dynamicComments = dynamicComments;
                }


                public List<?> getImages() { return images;}


                public void setImages(List<?> images) { this.images = images;}


                public List<PraisesBeanX> getPraises() { return praises;}


                public void setPraises(List<PraisesBeanX> praises) { this.praises = praises;}


                public static class RespVideoBean {
                    /**
                     * brief : 视屏验证小组赛
                     * businessId : 0
                     * categoryName : 足球
                     * duration : 42
                     * id : 25
                     * imageUrl : http://quncao.b0.upaiyun.com/dynamic/F2QNSJWAFD.jpg
                     * labelNames : ["我最美","啊实打实大安师大安师"]
                     * pv : 22050
                     * title : 运营题材验证
                     * uid : 9090588
                     * videoUrl : http://daren-10061568.video.myqcloud.com/1703/1135F2QOXY49BB.mp4
                     */

                    private String brief;
                    private int businessId;
                    private String categoryName;
                    private int duration;
                    private int id;
                    private String imageUrl;
                    private int pv;
                    private String title;
                    private int uid;
                    private String videoUrl;
                    private List<String> labelNames;


                    public String getBrief() { return brief;}


                    public void setBrief(String brief) { this.brief = brief;}


                    public int getBusinessId() { return businessId;}


                    public void setBusinessId(int businessId) { this.businessId = businessId;}


                    public String getCategoryName() { return categoryName;}


                    public void setCategoryName(String categoryName) {
                        this.categoryName = categoryName;
                    }


                    public int getDuration() { return duration;}


                    public void setDuration(int duration) { this.duration = duration;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public String getImageUrl() { return imageUrl;}


                    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                    public int getPv() { return pv;}


                    public void setPv(int pv) { this.pv = pv;}


                    public String getTitle() { return title;}


                    public void setTitle(String title) { this.title = title;}


                    public int getUid() { return uid;}


                    public void setUid(int uid) { this.uid = uid;}


                    public String getVideoUrl() { return videoUrl;}


                    public void setVideoUrl(String videoUrl) { this.videoUrl = videoUrl;}


                    public List<String> getLabelNames() { return labelNames;}


                    public void setLabelNames(List<String> labelNames) {
                        this.labelNames = labelNames;
                    }
                }


                public static class UserIconBeanX {
                    /**
                     * height : 0
                     * id : 0
                     * imageUrl : http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4
                     * isMain : 0
                     * isVideo : false
                     * state : 1
                     * thumbnailUrl : http://quncao.b0.upaiyun.com/user/icon/9090588Lnpdjvw3LPzbicU6KFrRjhTRN8hicicAuxteU4icOjhcp6aMW08y2Fn88VKyoiaEqgJDRtJbHh85C5GOKyZpoCF6Diad1ZayrB1Aw4
                     * width : 0
                     */

                    private int height;
                    private int id;
                    private String imageUrl;
                    private int isMain;
                    private boolean isVideo;
                    private int state;
                    private String thumbnailUrl;
                    private int width;


                    public int getHeight() { return height;}


                    public void setHeight(int height) { this.height = height;}


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public String getImageUrl() { return imageUrl;}


                    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                    public int getIsMain() { return isMain;}


                    public void setIsMain(int isMain) { this.isMain = isMain;}


                    public boolean isIsVideo() { return isVideo;}


                    public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                    public int getState() { return state;}


                    public void setState(int state) { this.state = state;}


                    public String getThumbnailUrl() { return thumbnailUrl;}


                    public void setThumbnailUrl(String thumbnailUrl) {
                        this.thumbnailUrl = thumbnailUrl;
                    }


                    public int getWidth() { return width;}


                    public void setWidth(int width) { this.width = width;}
                }


                public static class DynamicCommentsBean {
                    /**
                     * content : 记得记得觉得我
                     * createTime : 1490424644000
                     * dynamicDetailsId : 37373
                     * id : 673
                     * toUser : {"area_id":0,"gender":0,"icon":{"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"nick_name":"","province_id":0,"uid":0}
                     * type : 0
                     * user : {"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0},"is_verify_mobile":0,"nick_name":"我要用名字特别长��测试一口价","province_id":0,"uid":55}
                     */

                    private String content;
                    private long createTime;
                    private int dynamicDetailsId;
                    private int id;
                    private ToUserBean toUser;
                    private int type;
                    private UserBeanX user;


                    public String getContent() { return content;}


                    public void setContent(String content) { this.content = content;}


                    public long getCreateTime() { return createTime;}


                    public void setCreateTime(long createTime) { this.createTime = createTime;}


                    public int getDynamicDetailsId() { return dynamicDetailsId;}


                    public void setDynamicDetailsId(int dynamicDetailsId) {
                        this.dynamicDetailsId = dynamicDetailsId;
                    }


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public ToUserBean getToUser() { return toUser;}


                    public void setToUser(ToUserBean toUser) { this.toUser = toUser;}


                    public int getType() { return type;}


                    public void setType(int type) { this.type = type;}


                    public UserBeanX getUser() { return user;}


                    public void setUser(UserBeanX user) { this.user = user;}


                    public static class ToUserBean {
                        /**
                         * area_id : 0
                         * gender : 0
                         * icon : {"height":0,"id":0,"isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0}
                         * is_verify_mobile : 0
                         * nick_name :
                         * province_id : 0
                         * uid : 0
                         */

                        private int area_id;
                        private int gender;
                        private IconBeanX icon;
                        private int is_verify_mobile;
                        private String nick_name;
                        private int province_id;
                        private int uid;


                        public int getArea_id() { return area_id;}


                        public void setArea_id(int area_id) { this.area_id = area_id;}


                        public int getGender() { return gender;}


                        public void setGender(int gender) { this.gender = gender;}


                        public IconBeanX getIcon() { return icon;}


                        public void setIcon(IconBeanX icon) { this.icon = icon;}


                        public int getIs_verify_mobile() { return is_verify_mobile;}


                        public void setIs_verify_mobile(int is_verify_mobile) {
                            this.is_verify_mobile = is_verify_mobile;
                        }


                        public String getNick_name() { return nick_name;}


                        public void setNick_name(String nick_name) { this.nick_name = nick_name;}


                        public int getProvince_id() { return province_id;}


                        public void setProvince_id(int province_id) {
                            this.province_id = province_id;
                        }


                        public int getUid() { return uid;}


                        public void setUid(int uid) { this.uid = uid;}


                        public static class IconBeanX {
                            /**
                             * height : 0
                             * id : 0
                             * isMain : 0
                             * isVideo : false
                             * state : 1
                             * thumbnailUrl :
                             * width : 0
                             */

                            private int height;
                            private int id;
                            private int isMain;
                            private boolean isVideo;
                            private int state;
                            private String thumbnailUrl;
                            private int width;


                            public int getHeight() { return height;}


                            public void setHeight(int height) { this.height = height;}


                            public int getId() { return id;}


                            public void setId(int id) { this.id = id;}


                            public int getIsMain() { return isMain;}


                            public void setIsMain(int isMain) { this.isMain = isMain;}


                            public boolean isIsVideo() { return isVideo;}


                            public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                            public int getState() { return state;}


                            public void setState(int state) { this.state = state;}


                            public String getThumbnailUrl() { return thumbnailUrl;}


                            public void setThumbnailUrl(String thumbnailUrl) {
                                this.thumbnailUrl = thumbnailUrl;
                            }


                            public int getWidth() { return width;}


                            public void setWidth(int width) { this.width = width;}
                        }
                    }


                    public static class UserBeanX {
                        /**
                         * area_id : 0
                         * gender : 0
                         * icon : {"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","width":0}
                         * is_verify_mobile : 0
                         * nick_name : 我要用名字特别长��测试一口价
                         * province_id : 0
                         * uid : 55
                         */

                        private int area_id;
                        private int gender;
                        private IconBeanXX icon;
                        private int is_verify_mobile;
                        private String nick_name;
                        private int province_id;
                        private int uid;


                        public int getArea_id() { return area_id;}


                        public void setArea_id(int area_id) { this.area_id = area_id;}


                        public int getGender() { return gender;}


                        public void setGender(int gender) { this.gender = gender;}


                        public IconBeanXX getIcon() { return icon;}


                        public void setIcon(IconBeanXX icon) { this.icon = icon;}


                        public int getIs_verify_mobile() { return is_verify_mobile;}


                        public void setIs_verify_mobile(int is_verify_mobile) {
                            this.is_verify_mobile = is_verify_mobile;
                        }


                        public String getNick_name() { return nick_name;}


                        public void setNick_name(String nick_name) { this.nick_name = nick_name;}


                        public int getProvince_id() { return province_id;}


                        public void setProvince_id(int province_id) {
                            this.province_id = province_id;
                        }


                        public int getUid() { return uid;}


                        public void setUid(int uid) { this.uid = uid;}


                        public static class IconBeanXX {
                            /**
                             * height : 0
                             * id : 0
                             * imageUrl : https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg
                             * isMain : 0
                             * isVideo : false
                             * state : 1
                             * thumbnailUrl : https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg
                             * width : 0
                             */

                            private int height;
                            private int id;
                            private String imageUrl;
                            private int isMain;
                            private boolean isVideo;
                            private int state;
                            private String thumbnailUrl;
                            private int width;


                            public int getHeight() { return height;}


                            public void setHeight(int height) { this.height = height;}


                            public int getId() { return id;}


                            public void setId(int id) { this.id = id;}


                            public String getImageUrl() { return imageUrl;}


                            public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                            public int getIsMain() { return isMain;}


                            public void setIsMain(int isMain) { this.isMain = isMain;}


                            public boolean isIsVideo() { return isVideo;}


                            public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                            public int getState() { return state;}


                            public void setState(int state) { this.state = state;}


                            public String getThumbnailUrl() { return thumbnailUrl;}


                            public void setThumbnailUrl(String thumbnailUrl) {
                                this.thumbnailUrl = thumbnailUrl;
                            }


                            public int getWidth() { return width;}


                            public void setWidth(int width) { this.width = width;}
                        }
                    }
                }


                public static class PraisesBeanX {
                    /**
                     * id : 640
                     * isFollow : 0
                     * isFriend : 0
                     * user : {"area_id":0,"gender":0,"icon":{"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0},"is_verify_mobile":0,"province_id":0,"uid":55}
                     */

                    private int id;
                    private int isFollow;
                    private int isFriend;
                    private UserBeanXX user;


                    public int getId() { return id;}


                    public void setId(int id) { this.id = id;}


                    public int getIsFollow() { return isFollow;}


                    public void setIsFollow(int isFollow) { this.isFollow = isFollow;}


                    public int getIsFriend() { return isFriend;}


                    public void setIsFriend(int isFriend) { this.isFriend = isFriend;}


                    public UserBeanXX getUser() { return user;}


                    public void setUser(UserBeanXX user) { this.user = user;}


                    public static class UserBeanXX {
                        /**
                         * area_id : 0
                         * gender : 0
                         * icon : {"height":0,"id":0,"imageUrl":"https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg","isMain":0,"isVideo":false,"state":1,"thumbnailUrl":"","width":0}
                         * is_verify_mobile : 0
                         * province_id : 0
                         * uid : 55
                         */

                        private int area_id;
                        private int gender;
                        private IconBeanXXX icon;
                        private int is_verify_mobile;
                        private int province_id;
                        private int uid;


                        public int getArea_id() { return area_id;}


                        public void setArea_id(int area_id) { this.area_id = area_id;}


                        public int getGender() { return gender;}


                        public void setGender(int gender) { this.gender = gender;}


                        public IconBeanXXX getIcon() { return icon;}


                        public void setIcon(IconBeanXXX icon) { this.icon = icon;}


                        public int getIs_verify_mobile() { return is_verify_mobile;}


                        public void setIs_verify_mobile(int is_verify_mobile) {
                            this.is_verify_mobile = is_verify_mobile;
                        }


                        public int getProvince_id() { return province_id;}


                        public void setProvince_id(int province_id) {
                            this.province_id = province_id;
                        }


                        public int getUid() { return uid;}


                        public void setUid(int uid) { this.uid = uid;}


                        public static class IconBeanXXX {
                            /**
                             * height : 0
                             * id : 0
                             * imageUrl : https://quncao-app.b0.upaiyun.com/5a50f5b8bdc30fffe11d383cb3b7ebd2.jpg
                             * isMain : 0
                             * isVideo : false
                             * state : 1
                             * thumbnailUrl :
                             * width : 0
                             */

                            private int height;
                            private int id;
                            private String imageUrl;
                            private int isMain;
                            private boolean isVideo;
                            private int state;
                            private String thumbnailUrl;
                            private int width;


                            public int getHeight() { return height;}


                            public void setHeight(int height) { this.height = height;}


                            public int getId() { return id;}


                            public void setId(int id) { this.id = id;}


                            public String getImageUrl() { return imageUrl;}


                            public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl;}


                            public int getIsMain() { return isMain;}


                            public void setIsMain(int isMain) { this.isMain = isMain;}


                            public boolean isIsVideo() { return isVideo;}


                            public void setIsVideo(boolean isVideo) { this.isVideo = isVideo;}


                            public int getState() { return state;}


                            public void setState(int state) { this.state = state;}


                            public String getThumbnailUrl() { return thumbnailUrl;}


                            public void setThumbnailUrl(String thumbnailUrl) {
                                this.thumbnailUrl = thumbnailUrl;
                            }


                            public int getWidth() { return width;}


                            public void setWidth(int width) { this.width = width;}
                        }
                    }
                }
            }
        }
    }
}
