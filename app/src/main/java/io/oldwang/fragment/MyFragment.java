package io.oldwang.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import io.oldwang.R;
import io.oldwang.databinding.FragmentMyBinding;

/**
 * 我的界面
 * @author OldWang
 * @date 2020/12/1
 */
public class MyFragment extends Fragment {

    private FragmentMyBinding mBinding;

    private Context mContext;
    private boolean isShowUser = true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_my, container, false);
        mContext = getContext();

        initView();
        return mBinding.getRoot();
    }

    private void initView() {
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        // 当前页面显示
        isShowUser = isVisibleToUser;
    }
}
