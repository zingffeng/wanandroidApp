package top.zingfeng.wanandroid.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.fragments.HomeFragment;
import top.zingfeng.wanandroid.fragments.ProjectFragment;
import top.zingfeng.wanandroid.fragments.SquareFragment;
import top.zingfeng.wanandroid.fragments.SystemFragment;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.CollectBean;
import top.zingfeng.wanandroid.network.bean.UserBean;
import top.zingfeng.wanandroid.network.bean.UserInfoBean;
import top.zingfeng.wanandroid.network.services.AccountService;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
@Route(path = "/view/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Autowired
    String username = "";

    @BindView(R.id.fl_content)
    FrameLayout mFlContent;

    @BindView(R.id.bnv_nav)
    BottomNavigationView mBntNav;

    @BindView(R.id.nv_side_view)
    NavigationView mNvSideView;

    @BindView(R.id.tv_my_coins)
    TextView mTvMyCoins;

    @BindView(R.id.tv_title)
    TextView mTvTitle;

    @BindView(R.id.ll_logout)
    LinearLayout mLlLogout;

    @BindView(R.id.iv_side_nav)
    ImageView mIvSideNav;

    @BindView(R.id.dl_side_layout)
    DrawerLayout mDlSideLayout;

    private TextView mTvUsername;
    private TextView mTvLevel;
    private TextView mTvRank;

    private FragmentTransaction mFragmentTransaction;
    private HomeFragment mHomeFragment;
    private SquareFragment mSquareFragment;
    private SystemFragment mSystemFragment;
    private ProjectFragment mProjectFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
        initEvent();
    }

    private void initView(){
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
    }

    private void initData(){
        initAllFragment();
        initFirstFragment();
        requestData();
        initAdapter();

//        View view = mNvSideView.getHeaderView(0);
        View view = findViewById(R.id.nav_header_include);
        mTvUsername = view.findViewById(R.id.tv_username);
        mTvLevel = view.findViewById(R.id.tv_level);
        mTvRank = view.findViewById(R.id.tv_rank);

//        Retrofit retrofit = BaseRetrofit.getRetrofit();
//        AccountService userService = retrofit.create(AccountService.class);

        File file = new File("/data/data/top.zingfeng.wanandroid/shared_prefs/config.xml");
        if(file.exists()){
            SharedPreferences config = getSharedPreferences("config", Context.MODE_PRIVATE);
            Set<String> cookie = config.getStringSet("cookie", null);
            String username = config.getString("username", null);
            if (cookie.isEmpty() || cookie.size() == 1){
                mTvUsername.setText(getString(R.string.not_to_login));
                mLlLogout.setVisibility(View.GONE);
                mTvUsername.setOnClickListener(v -> {
                    ARouter.getInstance()
                            .build("/view/LoginActivity")
                            .navigation();
                });
            }else {
                if (!username.isEmpty()){
                    mTvUsername.setText(username);
                }
            }
        }else {
            mTvUsername.setText(getString(R.string.not_to_login));
            mLlLogout.setVisibility(View.GONE);
            mTvUsername.setOnClickListener(v -> {
                ARouter.getInstance()
                        .build("/view/LoginActivity")
                        .navigation();
            });
        }
    }

    private void initEvent(){
        mBntNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.menu_home:
                    mTvTitle.setText(getString(R.string.home));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mHomeFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mHomeFragment, "HomeFragment");
                    }
                    mFragmentTransaction.show(mHomeFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    break;
                case R.id.menu_square:
                    mTvTitle.setText(getString(R.string.square));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mSquareFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mSquareFragment, "SquareFragment");
                    }
                    mFragmentTransaction.show(mSquareFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    break;
                case R.id.menu_system:
                    mTvTitle.setText(getString(R.string.system));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mSystemFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mSystemFragment, "SystemFragment");
                    }
                    mFragmentTransaction.show(mSystemFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    break;
                case R.id.menu_project:
                    mTvTitle.setText(getString(R.string.project));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mProjectFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mProjectFragment, "ProjectFragment");
                    }
                    mFragmentTransaction.show(mProjectFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.commit();
                default:
                    break;
            }
            return true;
        });
        mIvSideNav.setOnClickListener(v -> {
            mDlSideLayout.openDrawer(GravityCompat.START);
        });

        mLlLogout.setOnClickListener(v -> {
            SharedPreferences config = getSharedPreferences("config", Context.MODE_PRIVATE);
            SharedPreferences.Editor edit = config.edit();
            HashSet<String> hashSet = new HashSet<>();
            hashSet.add("cookie");
            edit.putStringSet("cookie", hashSet);
            edit.putString("username", "");
            edit.apply();
        });
    }

    /**
     * 请求首页获取数据
     */
    private void requestData(){}

    /**
     * 初始化Adapter
     */
    private void initAdapter(){}

    private void initAllFragment(){
        mHomeFragment = new HomeFragment();
        mSquareFragment = new SquareFragment();
        mSystemFragment = new SystemFragment();
        mProjectFragment = new ProjectFragment();
    }

    /**
     * 设置第一个显示页面
     */
    private void initFirstFragment(){
        mHomeFragment = new HomeFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (!mHomeFragment.isAdded()){
            fragmentTransaction.add(R.id.fl_content, mHomeFragment, "homeFragment");
        }
        fragmentTransaction.show(mHomeFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        AccountService userService = retrofit.create(AccountService.class);
        Call<CollectBean> collect = userService.collect();
        collect.enqueue(new Callback<CollectBean>() {
            @Override
            public void onResponse(Call<CollectBean> call, Response<CollectBean> response) {
                CollectBean.DataBean data = response.body().getData();
                if (data != null){
//                    Log.d("===============>", "onResponse: " + response.body().getData().getSize());
                }
            }

            @Override
            public void onFailure(Call<CollectBean> call, Throwable t) {

            }
        });
        Call<UserInfoBean> userInfoBeanCall = userService.userInfo();
        userInfoBeanCall.enqueue(new Callback<UserInfoBean>() {
            @Override
            public void onResponse(Call<UserInfoBean> call, Response<UserInfoBean> response) {
                int errorCode = response.body().getErrorCode();
                UserInfoBean.DataBean data = response.body().getData();
                if (errorCode == -1001){
                    mLlLogout.setVisibility(View.GONE);
                }else if (errorCode == 0){
                    if (data != null){
                        StringBuilder stringBuffer = new StringBuilder();
                        StringBuilder level = stringBuffer.append(data.getLevel());
                        mTvLevel.setText(level);
                        String rank = data.getRank();
                        mTvRank.setText(rank);
                        stringBuffer.setLength(0);
                        StringBuilder coinCount = stringBuffer.append(data.getCoinCount());
                        mTvMyCoins.setText(coinCount);
                        mLlLogout.setVisibility(View.VISIBLE);
                    }
                }
            }

            @Override
            public void onFailure(Call<UserInfoBean> call, Throwable t) {

            }
        });

//        SharedPreferences config = getSharedPreferences("config", Context.MODE_PRIVATE);
//        String username = config.getString("username", null);
//        if (!username.isEmpty()){
//            mTvUsername.setText(username);
//        }
    }
}