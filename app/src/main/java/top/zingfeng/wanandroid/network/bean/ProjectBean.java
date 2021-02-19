package top.zingfeng.wanandroid.network.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public class ProjectBean implements Parcelable {

    /**
     * data : [{"children":[],"courseId":13,"id":294,"name":"完整项目","order":145000,"parentChapterId":293,"userControlSetTop":false,"visible":0},{"children":[],"courseId":13,"id":402,"name":"跨平台应用","order":145001,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":367,"name":"资源聚合类","order":145002,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":323,"name":"动画","order":145003,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":314,"name":"RV列表动效","order":145004,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":358,"name":"项目基础功能","order":145005,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":328,"name":"网络&amp;文件下载","order":145011,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":331,"name":"TextView","order":145013,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":336,"name":"键盘","order":145015,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":337,"name":"快应用","order":145016,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":338,"name":"日历&amp;时钟","order":145017,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":339,"name":"K线图","order":145018,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":340,"name":"硬件相关","order":145019,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":357,"name":"表格类","order":145022,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":363,"name":"创意汇","order":145024,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":380,"name":"ImageView","order":145029,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":382,"name":"音视频&amp;相机","order":145030,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":383,"name":"相机","order":145031,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":310,"name":"下拉刷新","order":145032,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":385,"name":"架构","order":145033,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":387,"name":"对话框","order":145035,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":388,"name":"数据库","order":145036,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":391,"name":"AS插件","order":145037,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":400,"name":"ViewPager","order":145039,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":401,"name":"二维码","order":145040,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":312,"name":"富文本编辑器","order":145041,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":526,"name":"IM","order":145042,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":539,"name":"未分类","order":145043,"parentChapterId":293,"userControlSetTop":false,"visible":1}]
     * errorCode : 0
     * errorMsg :
     */

    private int errorCode;
    private String errorMsg;
    private List<DataBean> data;

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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Parcelable {

        /**
         * children : []
         * courseId : 13
         * id : 294
         * name : 完整项目
         * order : 145000
         * parentChapterId : 293
         * userControlSetTop : false
         * visible : 0
         */

        private int courseId;
        private int id;
        private String name;
        private int order;
        private int parentChapterId;
        private boolean userControlSetTop;
        private int visible;
        private List<String> children;

        public int getCourseId() {
            return courseId;
        }

        public void setCourseId(int courseId) {
            this.courseId = courseId;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public int getParentChapterId() {
            return parentChapterId;
        }

        public void setParentChapterId(int parentChapterId) {
            this.parentChapterId = parentChapterId;
        }

        public boolean isUserControlSetTop() {
            return userControlSetTop;
        }

        public void setUserControlSetTop(boolean userControlSetTop) {
            this.userControlSetTop = userControlSetTop;
        }

        public int getVisible() {
            return visible;
        }

        public void setVisible(int visible) {
            this.visible = visible;
        }

        public List<String> getChildren() {
            return children;
        }

        public void setChildren(List<String> children) {
            this.children = children;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.courseId);
            dest.writeInt(this.id);
            dest.writeString(this.name);
            dest.writeInt(this.order);
            dest.writeInt(this.parentChapterId);
            dest.writeByte(this.userControlSetTop ? (byte) 1 : (byte) 0);
            dest.writeInt(this.visible);
            dest.writeStringList(this.children);
        }

        public DataBean() {
        }

        protected DataBean(Parcel in) {
            this.courseId = in.readInt();
            this.id = in.readInt();
            this.name = in.readString();
            this.order = in.readInt();
            this.parentChapterId = in.readInt();
            this.userControlSetTop = in.readByte() != 0;
            this.visible = in.readInt();
            this.children = in.createStringArrayList();
        }

        public static final Creator<DataBean> CREATOR = new Creator<DataBean>() {
            @Override
            public DataBean createFromParcel(Parcel source) {
                return new DataBean(source);
            }

            @Override
            public DataBean[] newArray(int size) {
                return new DataBean[size];
            }
        };
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.errorCode);
        dest.writeString(this.errorMsg);
        dest.writeList(this.data);
    }

    public ProjectBean() {
    }

    protected ProjectBean(Parcel in) {
        this.errorCode = in.readInt();
        this.errorMsg = in.readString();
        this.data = new ArrayList<DataBean>();
        in.readList(this.data, DataBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<ProjectBean> CREATOR = new Parcelable.Creator<ProjectBean>() {
        @Override
        public ProjectBean createFromParcel(Parcel source) {
            return new ProjectBean(source);
        }

        @Override
        public ProjectBean[] newArray(int size) {
            return new ProjectBean[size];
        }
    };
}
