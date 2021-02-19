package top.zingfeng.wanandroid.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.zingfeng.wanandroid.R;

/**
 * @author zingfeng
 * @date 2021/02/14
 */
public class SystemNavigationFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_system_navigation, container, false);
    }
}