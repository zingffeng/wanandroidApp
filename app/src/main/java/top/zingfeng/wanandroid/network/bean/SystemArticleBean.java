package top.zingfeng.wanandroid.network.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zingfeng
 * @date On 2021/2/15
 */
public class SystemArticleBean implements Parcelable {

    /**
     * data : [{"children":[{"children":[],"courseId":13,"id":60,"name":"Android Studio相关","order":1000,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":169,"name":"gradle","order":1001,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":269,"name":"官方发布","order":1002,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":529,"name":"90-120hz","order":1003,"parentChapterId":150,"userControlSetTop":false,"visible":1}],"courseId":13,"id":150,"name":"开发环境","order":1,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":168,"name":"Drawable","order":5000,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":172,"name":"deep link","order":5001,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":198,"name":"基础概念","order":5002,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":224,"name":"adb","order":5003,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":240,"name":"字符编码","order":5004,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":241,"name":"线程池","order":5005,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":257,"name":"Span","order":5006,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":306,"name":"多线程与并发","order":5007,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":307,"name":"Apk诞生记","order":5008,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":403,"name":"序列化","order":5009,"parentChapterId":167,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":536,"name":"多进程","order":5010,"parentChapterId":167,"userControlSetTop":false,"visible":1}],"courseId":13,"id":167,"name":"基础知识","order":5,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":10,"name":"Activity","order":10000,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":15,"name":"Service","order":10001,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":16,"name":"BroadcastReceiver","order":10002,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":17,"name":"ContentProvider","order":10003,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":19,"name":"Intent","order":10004,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":40,"name":"Context","order":10005,"parentChapterId":9,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":267,"name":"handler","order":10006,"parentChapterId":9,"userControlSetTop":false,"visible":1}],"courseId":13,"id":9,"name":"四大组件","order":10,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":26,"name":"基础UI控件","order":15000,"parentChapterId":25,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":27,"name":"ListView&GridView","order":15001,"parentChapterId":25,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":121,"name":"ViewPager","order":15003,"parentChapterId":25,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":124,"name":"Fragment","order":15004,"parentChapterId":25,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":259,"name":"ScrollView","order":15005,"parentChapterId":25,"userControlSetTop":false,"visible":1}],"courseId":13,"id":25,"name":"常用控件","order":15,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":30,"name":"Toast","order":20000,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":31,"name":"Dialog","order":20001,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":32,"name":"PopupWindow","order":20002,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":33,"name":"Notification","order":20003,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":190,"name":"震动","order":20004,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":263,"name":"截屏","order":20005,"parentChapterId":29,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":341,"name":"键盘","order":20006,"parentChapterId":29,"userControlSetTop":false,"visible":1}],"courseId":13,"id":29,"name":"用户交互","order":20,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":98,"name":"WebView","order":12000,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":67,"name":"网络基础","order":25000,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":68,"name":"volley","order":25001,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":69,"name":"okhttp","order":25002,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":70,"name":"retrofit","order":25003,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":71,"name":"数据解析","order":25004,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":200,"name":"https","order":25005,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":442,"name":"文件下载","order":25006,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":475,"name":"cookie","order":25007,"parentChapterId":34,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":481,"name":"DNS","order":25008,"parentChapterId":34,"userControlSetTop":false,"visible":1}],"courseId":13,"id":34,"name":"网络访问","order":25,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":87,"name":"图片加载库","order":6000,"parentChapterId":72,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":86,"name":"图片处理","order":6000,"parentChapterId":72,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":426,"name":"SVG","order":6001,"parentChapterId":72,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":479,"name":"Bitmap","order":6002,"parentChapterId":72,"userControlSetTop":false,"visible":1}],"courseId":13,"id":72,"name":"图片加载","order":30,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":89,"name":"app缓存相关","order":7000,"parentChapterId":35,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":90,"name":"数据库","order":7000,"parentChapterId":35,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":476,"name":"LRUCache","order":7001,"parentChapterId":35,"userControlSetTop":false,"visible":1}],"courseId":13,"id":35,"name":"数据存储","order":35,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":188,"name":"转场动画","order":8000,"parentChapterId":36,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":92,"name":"属性动画","order":8000,"parentChapterId":36,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":91,"name":"常规动画","order":8000,"parentChapterId":36,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":238,"name":"其他动画","order":8001,"parentChapterId":36,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":450,"name":"Lottie","order":8002,"parentChapterId":36,"userControlSetTop":false,"visible":1}],"courseId":13,"id":36,"name":"动画效果","order":40,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":126,"name":"绘图相关","order":9000,"parentChapterId":37,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":93,"name":"基础知识","order":9000,"parentChapterId":37,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":94,"name":"事件分发","order":9000,"parentChapterId":37,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":99,"name":"具体案例","order":9000,"parentChapterId":37,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":134,"name":"SurfaceView","order":9000,"parentChapterId":37,"userControlSetTop":false,"visible":1}],"courseId":13,"id":37,"name":"自定义控件","order":45,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":97,"name":"音视频","order":10000,"parentChapterId":38,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":95,"name":"相机Camera","order":10000,"parentChapterId":38,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":170,"name":"闹钟","order":10005,"parentChapterId":38,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":429,"name":"ffmpeg","order":10006,"parentChapterId":38,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":446,"name":"即时通讯IM","order":10007,"parentChapterId":38,"userControlSetTop":false,"visible":1}],"courseId":13,"id":38,"name":"多媒体技术","order":50,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":100,"name":"RecyclerView","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":55,"name":"新的API","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":193,"name":"分屏","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":183,"name":"WebP","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":142,"name":"ConstraintLayout","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":179,"name":"Data Binding","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":192,"name":"权限管理","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":54,"name":"新的控件","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":151,"name":"Vector","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":166,"name":"BottomSheet","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":165,"name":"Support Annotations","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":164,"name":"File Provider","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":125,"name":"CoordinatorLayout","order":11000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":140,"name":"dagger2","order":16000,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":329,"name":"Android 8.0","order":16001,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":332,"name":"嵌套滑动","order":16002,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":334,"name":"Architecture Components","order":16003,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":373,"name":"support-design","order":16004,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":406,"name":"Android 9.0","order":16005,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":443,"name":"Android 10.0","order":16006,"parentChapterId":39,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":444,"name":"androidx","order":16007,"parentChapterId":39,"userControlSetTop":false,"visible":1}],"courseId":13,"id":39,"name":"5.+高新技术","order":55,"parentChapterId":0,"userControlSetTop":false,"visible":0},{"children":[{"children":[],"courseId":13,"id":196,"name":"常见异常","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":195,"name":"设计模式","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":79,"name":"黑科技","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":191,"name":"数据采集与埋点","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":197,"name":"Native Crash","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":186,"name":"沉浸式","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":75,"name":"插件化","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":159,"name":"OpenGL ES","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":160,"name":"热修复","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":76,"name":"项目架构","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":74,"name":"反编译","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":73,"name":"面试相关","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":77,"name":"响应式编程","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":78,"name":"性能优化","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":81,"name":"学习的正确姿势","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":174,"name":"增量更新","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":146,"name":"React Native","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":61,"name":"Android测试相关","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":80,"name":"Github用法进阶","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":185,"name":"组件化","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":184,"name":"推送&即时通讯","order":12000,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":239,"name":"Xposed","order":12001,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":246,"name":"保活","order":12002,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":250,"name":"直播","order":12003,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":251,"name":"OpenCV","order":12004,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":262,"name":"SDK开发","order":12005,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":302,"name":"ANR","order":12006,"parentChapterId":53,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":364,"name":"模块化","order":12007,"parentChapterId":53,"userControlSetTop":false,"visible":0}],"courseId":13,"id":53,"name":"热门专题","order":60,"parentChapterId":0,"userControlSetTop":false,"visible":0},{"children":[{"children":[],"courseId":13,"id":131,"name":"蓝牙","order":14000,"parentChapterId":127,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":132,"name":"传感器","order":14000,"parentChapterId":127,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":133,"name":"NFC","order":14000,"parentChapterId":127,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":322,"name":"指纹","order":14001,"parentChapterId":127,"userControlSetTop":false,"visible":1}],"courseId":13,"id":127,"name":"硬件模块","order":70,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":149,"name":"so文件相关","order":15000,"parentChapterId":128,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":182,"name":"JNI编程","order":15000,"parentChapterId":128,"userControlSetTop":false,"visible":1}],"courseId":13,"id":128,"name":"JNI","order":75,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":136,"name":"地图","order":17000,"parentChapterId":130,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":137,"name":"后端云","order":17000,"parentChapterId":130,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":139,"name":"Crash捕获","order":17000,"parentChapterId":130,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":138,"name":"推送","order":17000,"parentChapterId":130,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":223,"name":"ocr&图像识别","order":17001,"parentChapterId":130,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":404,"name":"语音","order":17002,"parentChapterId":130,"userControlSetTop":false,"visible":1}],"courseId":13,"id":130,"name":"常用SDK","order":85,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":153,"name":"进程启动相关","order":18000,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":171,"name":"binder","order":18000,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":178,"name":"apk安装","order":18000,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":173,"name":"Choreographer","order":18000,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":155,"name":"SystemServer启动过程","order":18000,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":233,"name":"四大组件","order":18001,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":418,"name":"AOSP 源码编译","order":18002,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":431,"name":"Notification ","order":18003,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":432,"name":"UI渲染","order":18004,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":433,"name":"Window","order":18005,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":436,"name":"Looper","order":18006,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":437,"name":"oom killer","order":18007,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":438,"name":"权限","order":18008,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":441,"name":"AMS","order":18009,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":445,"name":"Service","order":18010,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":459,"name":"Activity","order":18011,"parentChapterId":152,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":467,"name":"进程","order":18012,"parentChapterId":152,"userControlSetTop":false,"visible":1}],"courseId":13,"id":152,"name":"framework","order":90,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":135,"name":"二维码","order":16000,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":199,"name":"MultiDex 启动优化","order":19000,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":163,"name":"Splash页优化","order":19000,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":158,"name":"Fragment懒加载","order":19000,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":157,"name":"获取设备唯一标识","order":19000,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":222,"name":"持续集成","order":19001,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":228,"name":"辅助 or 工具类","order":19002,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":230,"name":"打包","order":19003,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":237,"name":"下拉刷新&上拉加载","order":19004,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":242,"name":"实用插件","order":19005,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":247,"name":"防逆向","order":19006,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":252,"name":"奇怪的Bug","order":19007,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":258,"name":"三方分享 & 登录","order":19008,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":260,"name":"RxJava & Retrofit & MVP","order":19009,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":261,"name":"屏幕适配","order":19010,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":268,"name":"优秀的设计","order":19011,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":270,"name":"埋点","order":19012,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":295,"name":"混淆","order":19013,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":335,"name":"应用内更新","order":19014,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":345,"name":"国际化","order":19015,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":379,"name":"Android P 适配","order":19016,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":392,"name":"兼容性","order":19017,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":399,"name":"抓包","order":19018,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":465,"name":"通知","order":19019,"parentChapterId":156,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":492,"name":"开发规范","order":19020,"parentChapterId":156,"userControlSetTop":false,"visible":1}],"courseId":13,"id":156,"name":"项目必备","order":95,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":177,"name":"公司对外","order":20000,"parentChapterId":175,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":176,"name":"个人博客","order":20000,"parentChapterId":175,"userControlSetTop":false,"visible":1}],"courseId":13,"id":175,"name":"推荐网站","order":100,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":203,"name":"javapoet","order":21000,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":202,"name":"机器学习&人工智能","order":21000,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":181,"name":"javassist","order":21000,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":243,"name":"JVM","order":21001,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":273,"name":"Android AR","order":21002,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":296,"name":"阅读","order":21003,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":303,"name":"区块链","order":21004,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":318,"name":"搭建博客","order":21005,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":368,"name":"计算机基础","order":21006,"parentChapterId":180,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":499,"name":"ASM","order":21007,"parentChapterId":180,"userControlSetTop":false,"visible":1}],"courseId":13,"id":180,"name":"延伸技术","order":105,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":227,"name":"注解","order":110000,"parentChapterId":225,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":229,"name":"AOP","order":110001,"parentChapterId":225,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":265,"name":"反射","order":110002,"parentChapterId":225,"userControlSetTop":false,"visible":1}],"courseId":13,"id":225,"name":"注解 & 反射 & AOP","order":110,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":232,"name":"入门及知识点","order":115000,"parentChapterId":231,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":424,"name":"协程","order":115001,"parentChapterId":231,"userControlSetTop":false,"visible":1}],"courseId":13,"id":231,"name":"Kotlin","order":115,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":245,"name":"集合相关","order":120000,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":304,"name":"基础源码","order":120001,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":308,"name":"多线程","order":120002,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":313,"name":"字节码","order":120003,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":317,"name":"Lambda","order":120004,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":320,"name":"内存管理","order":120005,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":321,"name":"算法","order":120006,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":346,"name":"JVM","order":120007,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":362,"name":"泛型","order":120008,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":412,"name":"io","order":120009,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":451,"name":"加密解密","order":120010,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":454,"name":"规范","order":120011,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":455,"name":"反射","order":120012,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":488,"name":"Java8+","order":120013,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":491,"name":"类加载","order":120014,"parentChapterId":244,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":500,"name":"正则","order":120015,"parentChapterId":244,"userControlSetTop":false,"visible":1}],"courseId":13,"id":244,"name":"Java深入","order":120,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":249,"name":"干货资源","order":125000,"parentChapterId":248,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":292,"name":"pdf电子书","order":125001,"parentChapterId":248,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":305,"name":"各类工具","order":125002,"parentChapterId":248,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":361,"name":"课程推荐","order":125003,"parentChapterId":248,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":456,"name":"娱乐","order":125004,"parentChapterId":248,"userControlSetTop":false,"visible":1}],"courseId":13,"id":248,"name":"干货资源","order":125,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":254,"name":"新闻资讯","order":130000,"parentChapterId":253,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":255,"name":"工具类","order":130001,"parentChapterId":253,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":256,"name":"音乐、视频类","order":130002,"parentChapterId":253,"userControlSetTop":false,"visible":1}],"courseId":13,"id":253,"name":"完整开源项目","order":130,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":272,"name":"常用网站","order":140000,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":398,"name":"速查","order":140010,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":393,"name":"查看源码","order":140020,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":528,"name":"优秀的博客","order":140021,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":274,"name":"个人博客","order":140030,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":281,"name":"公司博客","order":140050,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":430,"name":"Flutter","order":140055,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":280,"name":"开发社区","order":140060,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":275,"name":"常用工具","order":140070,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":527,"name":"官方信息","order":140071,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":278,"name":"互联网资讯","order":140080,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":276,"name":"在线学习","order":140090,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":284,"name":"推送平台","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":286,"name":"地图平台","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":282,"name":"应用加固","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":359,"name":"应用发布","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":0},{"children":[],"courseId":13,"id":300,"name":"互联网统计","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":365,"name":"反馈平台","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":0},{"children":[],"courseId":13,"id":301,"name":"快速开发","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":299,"name":"创意&素材","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":291,"name":"WebView内核","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":290,"name":"后端云","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":289,"name":"Bug管理","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":283,"name":"三方支付","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":277,"name":"开放平台","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":369,"name":"短视频SDK","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":288,"name":"IM即时通讯","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":366,"name":"在线文档","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":287,"name":"直播SDK","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":285,"name":"三方分享","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":279,"name":"求职招聘","order":140999,"parentChapterId":271,"userControlSetTop":false,"visible":1}],"courseId":13,"id":271,"name":"导航主Tab","order":140,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":294,"name":"完整项目","order":145000,"parentChapterId":293,"userControlSetTop":false,"visible":0},{"children":[],"courseId":13,"id":402,"name":"跨平台应用","order":145001,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":367,"name":"资源聚合类","order":145002,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":323,"name":"动画","order":145003,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":314,"name":"RV列表动效","order":145004,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":358,"name":"项目基础功能","order":145005,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":328,"name":"网络&amp;文件下载","order":145011,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":331,"name":"TextView","order":145013,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":336,"name":"键盘","order":145015,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":337,"name":"快应用","order":145016,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":338,"name":"日历&amp;时钟","order":145017,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":339,"name":"K线图","order":145018,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":340,"name":"硬件相关","order":145019,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":357,"name":"表格类","order":145022,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":363,"name":"创意汇","order":145024,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":380,"name":"ImageView","order":145029,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":382,"name":"音视频&amp;相机","order":145030,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":383,"name":"相机","order":145031,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":310,"name":"下拉刷新","order":145032,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":385,"name":"架构","order":145033,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":387,"name":"对话框","order":145035,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":388,"name":"数据库","order":145036,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":391,"name":"AS插件","order":145037,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":400,"name":"ViewPager","order":145039,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":401,"name":"二维码","order":145040,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":312,"name":"富文本编辑器","order":145041,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":526,"name":"IM","order":145042,"parentChapterId":293,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":539,"name":"未分类","order":145043,"parentChapterId":293,"userControlSetTop":false,"visible":1}],"courseId":13,"id":293,"name":"开源项目主Tab","order":145,"parentChapterId":0,"userControlSetTop":false,"visible":0},{"children":[{"children":[],"courseId":13,"id":298,"name":"我的博客","order":150000,"parentChapterId":297,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":360,"name":"小编发布","order":150001,"parentChapterId":297,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":449,"name":"技术周刊","order":150002,"parentChapterId":297,"userControlSetTop":false,"visible":1}],"courseId":13,"id":297,"name":"原创文章","order":150,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":343,"name":"TV","order":155000,"parentChapterId":342,"userControlSetTop":false,"visible":1}],"courseId":13,"id":342,"name":"TV相关","order":155,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":349,"name":"日历","order":160000,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":350,"name":"电影&音乐","order":160001,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":352,"name":"资讯","order":160002,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":353,"name":"快递","order":160003,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":354,"name":"天气","order":160004,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":355,"name":"他人收集","order":160005,"parentChapterId":348,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":356,"name":"翻译","order":160006,"parentChapterId":348,"userControlSetTop":false,"visible":1}],"courseId":13,"id":348,"name":"开放API","order":160,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":375,"name":"Flutter","order":165000,"parentChapterId":374,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":425,"name":"emoji","order":165001,"parentChapterId":374,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":435,"name":"小程序","order":165002,"parentChapterId":374,"userControlSetTop":false,"visible":1}],"courseId":13,"id":374,"name":"跨平台","order":165,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":377,"name":"优质内推","order":170000,"parentChapterId":376,"userControlSetTop":false,"visible":1}],"courseId":13,"id":376,"name":"内推","order":170,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":390,"name":"Git","order":175000,"parentChapterId":389,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":477,"name":"UML","order":175001,"parentChapterId":389,"userControlSetTop":false,"visible":1}],"courseId":13,"id":389,"name":"项目管理","order":175,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":395,"name":"事件总线","order":180000,"parentChapterId":394,"userControlSetTop":false,"visible":1}],"courseId":13,"id":394,"name":"开源项目源码解析","order":180,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":397,"name":"速查知识表","order":185,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":408,"name":"鸿洋","order":190000,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":409,"name":"郭霖","order":190001,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":410,"name":"玉刚说","order":190002,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":411,"name":"承香墨影","order":190003,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":413,"name":"Android群英传","order":190004,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":414,"name":"code小生","order":190005,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":415,"name":"谷歌开发者","order":190006,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":416,"name":"奇卓社","order":190007,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":417,"name":"美团技术团队","order":190008,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":420,"name":"GcsSloop","order":190009,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":421,"name":"互联网侦察","order":190010,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":427,"name":"susion随心","order":190011,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":428,"name":"程序亦非猿","order":190012,"parentChapterId":407,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":434,"name":"Gityuan","order":190013,"parentChapterId":407,"userControlSetTop":false,"visible":1}],"courseId":13,"id":407,"name":"公众号","order":190,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":423,"name":"Architecture","order":195000,"parentChapterId":422,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":478,"name":"DataBinding","order":195001,"parentChapterId":422,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":480,"name":"Paging","order":195002,"parentChapterId":422,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":486,"name":"LiveData","order":195003,"parentChapterId":422,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":487,"name":"ViewModel","order":195004,"parentChapterId":422,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":506,"name":"compose","order":195005,"parentChapterId":422,"userControlSetTop":false,"visible":1}],"courseId":13,"id":422,"name":"Jetpack","order":195,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":440,"name":"官方","order":200000,"parentChapterId":439,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":472,"name":"测试","order":200001,"parentChapterId":439,"userControlSetTop":false,"visible":1}],"courseId":13,"id":439,"name":"问答","order":200,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":448,"name":"慕课网","order":205000,"parentChapterId":447,"userControlSetTop":false,"visible":1}],"courseId":13,"id":447,"name":"视频","order":205,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":453,"name":"6.0 ( M )","order":210000,"parentChapterId":452,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":464,"name":"Google_Play_要求","order":210001,"parentChapterId":452,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":471,"name":"10.0（Q）","order":210002,"parentChapterId":452,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":483,"name":"P（9.0）","order":210003,"parentChapterId":452,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":530,"name":"11（R）","order":210004,"parentChapterId":452,"userControlSetTop":false,"visible":1}],"courseId":13,"id":452,"name":"版本适配","order":210,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":458,"name":"mmap","order":215000,"parentChapterId":457,"userControlSetTop":false,"visible":1}],"courseId":13,"id":457,"name":"linux","order":215,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":461,"name":"fresco","order":220000,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":466,"name":"Gson","order":220001,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":468,"name":"Glide","order":220002,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":473,"name":"Shadow","order":220003,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":474,"name":"RxJava","order":220004,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":484,"name":"okhttp","order":220005,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":485,"name":"MMKV","order":220006,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":489,"name":"RxJava","order":220007,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":490,"name":"Eventbus","order":220008,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":495,"name":"booster","order":220009,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":497,"name":"instant run","order":220010,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":498,"name":"Hardcoder","order":220011,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":503,"name":"robust","order":220012,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":504,"name":"Dokit","order":220013,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":505,"name":"LeakCanary","order":220014,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":507,"name":"BlockCanary","order":220015,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":508,"name":"retrofit","order":220016,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":531,"name":"tinker","order":220017,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":534,"name":"ARouter","order":220018,"parentChapterId":460,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":540,"name":"Koom","order":220019,"parentChapterId":460,"userControlSetTop":false,"visible":1}],"courseId":13,"id":460,"name":"常见开源库源码解析","order":220,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":463,"name":"掘金翻译计划","order":225000,"parentChapterId":462,"userControlSetTop":false,"visible":1}],"courseId":13,"id":462,"name":"翻译","order":225,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":494,"name":"广场","order":235000,"parentChapterId":493,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":502,"name":"自助","order":235001,"parentChapterId":493,"userControlSetTop":false,"visible":1}],"courseId":13,"id":493,"name":"广场Tab","order":235,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":510,"name":"大厂分享","order":240000,"parentChapterId":509,"userControlSetTop":false,"visible":1}],"courseId":13,"id":509,"name":"大厂对外分享","order":240,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":512,"name":"图标网站","order":245000,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":513,"name":"插画设计","order":245001,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":514,"name":"图库网站","order":245002,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":515,"name":"样机工具","order":245003,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":516,"name":"配色推荐","order":245004,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":517,"name":"UI 套件","order":245005,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":518,"name":"背景素材","order":245006,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":519,"name":"代码美化","order":245007,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":520,"name":"截图美化","order":245008,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":521,"name":"字体设计","order":245009,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":522,"name":"设计灵感","order":245010,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":523,"name":"生成头像","order":245011,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":524,"name":"思维导图","order":245012,"parentChapterId":511,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":525,"name":"压缩网站","order":245013,"parentChapterId":511,"userControlSetTop":false,"visible":1}],"courseId":13,"id":511,"name":"设计Tab","order":245,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":533,"name":" HarmonyOS","order":250000,"parentChapterId":532,"userControlSetTop":false,"visible":1}],"courseId":13,"id":532,"name":"鸿蒙","order":250,"parentChapterId":0,"userControlSetTop":false,"visible":1},{"children":[{"children":[],"courseId":13,"id":537,"name":"大厂分享","order":255000,"parentChapterId":535,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":538,"name":"基础知识","order":255001,"parentChapterId":535,"userControlSetTop":false,"visible":1}],"courseId":13,"id":535,"name":"端智能","order":255,"parentChapterId":0,"userControlSetTop":false,"visible":1}]
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
         * children : [{"children":[],"courseId":13,"id":60,"name":"Android Studio相关","order":1000,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":169,"name":"gradle","order":1001,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":269,"name":"官方发布","order":1002,"parentChapterId":150,"userControlSetTop":false,"visible":1},{"children":[],"courseId":13,"id":529,"name":"90-120hz","order":1003,"parentChapterId":150,"userControlSetTop":false,"visible":1}]
         * courseId : 13
         * id : 150
         * name : 开发环境
         * order : 1
         * parentChapterId : 0
         * userControlSetTop : false
         * visible : 1
         */

        private int courseId;
        private int id;
        private String name;
        private int order;
        private int parentChapterId;
        private boolean userControlSetTop;
        private int visible;
        private List<ChildrenBean> children;

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

        public List<ChildrenBean> getChildren() {
            return children;
        }

        public void setChildren(List<ChildrenBean> children) {
            this.children = children;
        }

        public static class ChildrenBean implements Parcelable {

            /**
             * children : []
             * courseId : 13
             * id : 60
             * name : Android Studio相关
             * order : 1000
             * parentChapterId : 150
             * userControlSetTop : false
             * visible : 1
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

            public ChildrenBean() {
            }

            protected ChildrenBean(Parcel in) {
                this.courseId = in.readInt();
                this.id = in.readInt();
                this.name = in.readString();
                this.order = in.readInt();
                this.parentChapterId = in.readInt();
                this.userControlSetTop = in.readByte() != 0;
                this.visible = in.readInt();
                this.children = in.createStringArrayList();
            }

            public static final Creator<ChildrenBean> CREATOR = new Creator<ChildrenBean>() {
                @Override
                public ChildrenBean createFromParcel(Parcel source) {
                    return new ChildrenBean(source);
                }

                @Override
                public ChildrenBean[] newArray(int size) {
                    return new ChildrenBean[size];
                }
            };
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
            dest.writeList(this.children);
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
            this.children = new ArrayList<ChildrenBean>();
            in.readList(this.children, ChildrenBean.class.getClassLoader());
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

    public SystemArticleBean() {
    }

    protected SystemArticleBean(Parcel in) {
        this.errorCode = in.readInt();
        this.errorMsg = in.readString();
        this.data = new ArrayList<DataBean>();
        in.readList(this.data, DataBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<SystemArticleBean> CREATOR = new Parcelable.Creator<SystemArticleBean>() {
        @Override
        public SystemArticleBean createFromParcel(Parcel source) {
            return new SystemArticleBean(source);
        }

        @Override
        public SystemArticleBean[] newArray(int size) {
            return new SystemArticleBean[size];
        }
    };
}
