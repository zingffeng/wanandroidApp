package top.zingfeng.wanandroid.fragments;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.adapter.NavigationViewPageAdapter;

/**
 * @author zingfeng
 * @date 2021/02/14
 */
public class SystemFragment extends Fragment {

    private Context mCtx;

    @BindView(R.id.tl_system_tab)
    TabLayout mTlSystemTab;

    @BindView(R.id.fl_content)
    FrameLayout mFlContent;

//    @BindView(R.id.vp_content)
//    ViewPager mVpContent;

    private SystemDetailFragment mSystemDetailFragment;
    private SystemNavigationFragment mSystemNavigationFragment;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mCtx = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mCtx = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_system, container, false);
        ButterKnife.bind(this, view);
        initData();
        initEvent();
        return view;
    }

    private void initData(){
        mSystemDetailFragment = new SystemDetailFragment();
        mSystemNavigationFragment = new SystemNavigationFragment();

        mTlSystemTab.addTab(mTlSystemTab.newTab().setText(getString(R.string.system)));
        mTlSystemTab.addTab(mTlSystemTab.newTab().setText(getString(R.string.navigation)));

        FragmentTransaction fragmentTransaction = getChildFragmentManager().beginTransaction();
        if (!mSystemDetailFragment.isAdded()){
            fragmentTransaction.add(R.id.fl_content, mSystemDetailFragment, "homeFragment");
        }
        fragmentTransaction.show(mSystemDetailFragment);
        fragmentTransaction.hide(mSystemNavigationFragment);
        fragmentTransaction.commit();
    }

    private FragmentTransaction fragmentTransaction;
    private void initEvent(){

        mTlSystemTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()){
                    case 0:
                        mSystemDetailFragment = new SystemDetailFragment();
                        fragmentTransaction = getChildFragmentManager().beginTransaction();
                        if (!mSystemDetailFragment.isAdded()){
                            fragmentTransaction.add(R.id.fl_content, mSystemDetailFragment, "homeFragment");
                        }
                        fragmentTransaction.show(mSystemDetailFragment);
                        fragmentTransaction.hide(mSystemNavigationFragment);
                        fragmentTransaction.commit();
                        break;
                    case 1:
                        mSystemNavigationFragment = new SystemNavigationFragment();
                        fragmentTransaction = getChildFragmentManager().beginTransaction();
                        if (!mSystemNavigationFragment.isAdded()){
                            fragmentTransaction.add(R.id.fl_content, mSystemNavigationFragment, "systemNavigationFragment");
                        }
                        fragmentTransaction.show(mSystemNavigationFragment);
                        fragmentTransaction.hide(mSystemDetailFragment);
                        fragmentTransaction.commit();
                        break;
                    default:
                        break;
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