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
import io.oldwang.databinding.FragmentTestBinding;


/**
 * 界面1界面
 * @author OldWang
 * @date 2020/12/1
 */
public class TestFragment extends Fragment {

    private FragmentTestBinding mBinding;

    private Context mContext;
    private boolean mIsShowUser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_test, container, false);
        mContext = getContext();

        initView();
        return mBinding.getRoot();
    }

    @SuppressLint("SetTextI18n")
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
        mIsShowUser = isVisibleToUser;
    }
}
