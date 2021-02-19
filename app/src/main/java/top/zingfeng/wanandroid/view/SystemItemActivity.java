package top.zingfeng.wanandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.fragments.SystemDetailTypeFragment;
import top.zingfeng.wanandroid.network.bean.SystemArticleBean;

/**
 * @author zingfeng
 * @date 2021/02/15
 */
@Route(path = "/fragment/SystemItemActivity")
public class SystemItemActivity extends AppCompatActivity {

    @Autowired
    SystemArticleBean.DataBean data;

    @BindView(R.id.iv_back)
    ImageView mIvBack;

    @BindView(R.id.tv_title)
    TextView mTvTitle;

    @BindView(R.id.tl_system_tab_item)
    TabLayout mTlSystemTabItem;

    @BindView(R.id.fl_content)
    FrameLayout mFlContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_item);
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
        initData();
        initEvent();
    }

    private void initData(){
        if (data != null){
            mTvTitle.setText(data.getName());
            for (SystemArticleBean.DataBean.ChildrenBean childrenBean: data.getChildren()){
                mTlSystemTabItem.addTab(mTlSystemTabItem.newTab().setText(childrenBean.getName()));
            }
            SystemArticleBean.DataBean.ChildrenBean childrenBean = data.getChildren().get(0);
            SystemDetailTypeFragment systemDetailTypeFragment = SystemDetailTypeFragment.newInstance(childrenBean);
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            if (!systemDetailTypeFragment.isAdded()){
                fragmentTransaction.add(R.id.fl_content, systemDetailTypeFragment);
            }
            fragmentTransaction.show(systemDetailTypeFragment);
            fragmentTransaction.commit();
        }
    }

    private void initEvent(){
        mIvBack.setOnClickListener(v -> {
            finish();
        });
        mTlSystemTabItem.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if (data != null){
                    SystemArticleBean.DataBean.ChildrenBean childrenBean = data.getChildren().get(tab.getPosition());
                    SystemDetailTypeFragment systemDetailTypeFragment = SystemDetailTypeFragment.newInstance(childrenBean);
                    FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.fl_content, systemDetailTypeFragment);
                    fragmentTransaction.commit();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}