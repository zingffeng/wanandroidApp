package top.zingfeng.wanandroid.network.bean;

import java.util.List;

/**
 * @author zingfeng
 * @date On 2021/2/18
 */
public class CollectBean {

    /**
     * data : {"curPage":1,"datas":[{"author":"","chapterId":60,"chapterName":"Android Studio相关","courseId":13,"desc":"","envelopePic":"","id":173834,"link":"https://juejin.im/post/5e94815551882573af79b2a0","niceDate":"2天前","origin":"","originId":12871,"publishTime":1613439453000,"title":"数据库还可以这么看？（Android Studio 4.1 新特性）","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126395,"link":"https://blog.csdn.net/fengyeNom1/article/details/105410355","niceDate":"2020-04-10 20:40","origin":"","originId":12793,"publishTime":1586522403000,"title":"安卓夜间模式开发【深色主题适配】","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126394,"link":"https://blog.csdn.net/fengyeNom1/article/details/105331406","niceDate":"2020-04-10 20:40","origin":"","originId":12794,"publishTime":1586522401000,"title":"4月4日，各种App流行灰色模式，实现探索","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126393,"link":"https://juejin.im/post/5e8ebd29e51d4560ea31fb02","niceDate":"2020-04-10 20:40","origin":"","originId":12795,"publishTime":1586522400000,"title":"最新的kt+jetpack+Coroutine打造的Android开发框架","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126392,"link":"https://www.jianshu.com/p/1421dbace522","niceDate":"2020-04-10 20:39","origin":"","originId":12796,"publishTime":1586522398000,"title":"RxJava 观察绑定和事件发送流程及其中的线程切换分析","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126391,"link":"https://blog.csdn.net/yinxing2008/article/details/82971037","niceDate":"2020-04-10 20:39","origin":"","originId":12801,"publishTime":1586522396000,"title":"安卓开发优秀实践合集","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126390,"link":"https://juejin.im/post/5e8de600e51d4546b4350fb5","niceDate":"2020-04-10 20:39","origin":"","originId":12800,"publishTime":1586522394000,"title":"Androidx 之 RecylerView使用","userId":57596,"visible":0,"zan":0}],"offset":0,"over":true,"pageCount":1,"size":20,"total":7}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"author":"","chapterId":60,"chapterName":"Android Studio相关","courseId":13,"desc":"","envelopePic":"","id":173834,"link":"https://juejin.im/post/5e94815551882573af79b2a0","niceDate":"2天前","origin":"","originId":12871,"publishTime":1613439453000,"title":"数据库还可以这么看？（Android Studio 4.1 新特性）","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126395,"link":"https://blog.csdn.net/fengyeNom1/article/details/105410355","niceDate":"2020-04-10 20:40","origin":"","originId":12793,"publishTime":1586522403000,"title":"安卓夜间模式开发【深色主题适配】","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126394,"link":"https://blog.csdn.net/fengyeNom1/article/details/105331406","niceDate":"2020-04-10 20:40","origin":"","originId":12794,"publishTime":1586522401000,"title":"4月4日，各种App流行灰色模式，实现探索","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126393,"link":"https://juejin.im/post/5e8ebd29e51d4560ea31fb02","niceDate":"2020-04-10 20:40","origin":"","originId":12795,"publishTime":1586522400000,"title":"最新的kt+jetpack+Coroutine打造的Android开发框架","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126392,"link":"https://www.jianshu.com/p/1421dbace522","niceDate":"2020-04-10 20:39","origin":"","originId":12796,"publishTime":1586522398000,"title":"RxJava 观察绑定和事件发送流程及其中的线程切换分析","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126391,"link":"https://blog.csdn.net/yinxing2008/article/details/82971037","niceDate":"2020-04-10 20:39","origin":"","originId":12801,"publishTime":1586522396000,"title":"安卓开发优秀实践合集","userId":57596,"visible":0,"zan":0},{"author":"","chapterId":494,"chapterName":"广场","courseId":13,"desc":"","envelopePic":"","id":126390,"link":"https://juejin.im/post/5e8de600e51d4546b4350fb5","niceDate":"2020-04-10 20:39","origin":"","originId":12800,"publishTime":1586522394000,"title":"Androidx 之 RecylerView使用","userId":57596,"visible":0,"zan":0}]
         * offset : 0
         * over : true
         * pageCount : 1
         * size : 20
         * total : 7
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * author :
             * chapterId : 60
             * chapterName : Android Studio相关
             * courseId : 13
             * desc :
             * envelopePic :
             * id : 173834
             * link : https://juejin.im/post/5e94815551882573af79b2a0
             * niceDate : 2天前
             * origin :
             * originId : 12871
             * publishTime : 1613439453000
             * title : 数据库还可以这么看？（Android Studio 4.1 新特性）
             * userId : 57596
             * visible : 0
             * zan : 0
             */

            private String author;
            private int chapterId;
            private String chapterName;
            private int courseId;
            private String desc;
            private String envelopePic;
            private int id;
            private String link;
            private String niceDate;
            private String origin;
            private int originId;
            private long publishTime;
            private String title;
            private int userId;
            private int visible;
            private int zan;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public int getOriginId() {
                return originId;
            }

            public void setOriginId(int originId) {
                this.originId = originId;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }
        }
    }
}
