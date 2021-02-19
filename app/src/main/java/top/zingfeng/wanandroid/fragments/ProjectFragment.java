package top.zingfeng.wanandroid.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.network.BaseRetrofit;
import top.zingfeng.wanandroid.network.bean.ProjectBean;
import top.zingfeng.wanandroid.network.services.ProjectService;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public class ProjectFragment extends Fragment {

    @BindView(R.id.tl_project_tab)
    TabLayout mTlProjectTab;

    @BindView(R.id.fl_content)
    FrameLayout mFlContent;

    private ProjectDetailFragment mProjectDetailFragment;
    private FragmentTransaction mFragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_project, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    private void initData(){
        Retrofit retrofit = BaseRetrofit.getRetrofit();
        ProjectService projectService = retrofit.create(ProjectService.class);
        Call<ProjectBean> project = projectService.getProject();
        project.enqueue(new Callback<ProjectBean>() {
            @Override
            public void onResponse(Call<ProjectBean> call, Response<ProjectBean> response) {
                List<ProjectBean.DataBean> data = response.body().getData();
                initFragment(data.get(0));
                for (ProjectBean.DataBean dataBean: data){
                    mTlProjectTab.addTab(mTlProjectTab.newTab().setText(dataBean.getName()));
                }
                mTlProjectTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                    @Override
                    public void onTabSelected(TabLayout.Tab tab) {
                        ProjectBean.DataBean dataBean = data.get(tab.getPosition());
                        ProjectDetailFragment projectDetailFragment = ProjectDetailFragment.newInstance(dataBean);
                        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.fl_content, projectDetailFragment);
                        fragmentTransaction.commit();
                    }

                    @Override
                    public void onTabUnselected(TabLayout.Tab tab) {

                    }

                    @Override
                    public void onTabReselected(TabLayout.Tab tab) {

                    }
                });
            }

            @Override
            public void onFailure(Call<ProjectBean> call, Throwable t) {

            }
        });
    }

    private void initEvent(){

    }

    /**
     * 初始化Fragment
     * @param dataBean 数据参数
     */
    private void initFragment(ProjectBean.DataBean dataBean){
        mProjectDetailFragment = ProjectDetailFragment.newInstance(dataBean);
        mFragmentTransaction = getChildFragmentManager().beginTransaction();
        if (!mProjectDetailFragment.isAdded()){
            mFragmentTransaction.add(R.id.fl_content, mProjectDetailFragment);
        }
        mFragmentTransaction.commit();
    }
}