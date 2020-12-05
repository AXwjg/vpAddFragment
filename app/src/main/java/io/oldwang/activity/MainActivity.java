package io.oldwang.activity;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

import io.oldwang.R;
import io.oldwang.adapter.MyPagerAdapter;
import io.oldwang.databinding.ActivityMainBinding;
import io.oldwang.fragment.MyFragment;
import io.oldwang.fragment.TestFragment;

/**
 * @author OldWang
 * @date 2020/12/1
 */
public class MainActivity extends AppCompatActivity{

    private ActivityMainBinding mBinding;
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = this;
        initView();

    }

    protected void initView() {
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ArrayList<Fragment> fragmentArrayList = new ArrayList<>();
        fragmentArrayList.add(new TestFragment());
        fragmentArrayList.add(new MyFragment());
        mBinding.viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager(), mContext, fragmentArrayList));
        // 关联ViewPager后清空Tab
        mBinding.tabLayout.setupWithViewPager(mBinding.viewPager);
        mBinding.tabLayout.removeAllTabs();
        // 重新添加Tab
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab()
                .setText(getResources().getString(R.string.warehousing_tab))
                .setIcon(getResources().getDrawable(R.drawable.home_selector)));
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab()
                .setText(getResources().getString(R.string.my_tab_title))
                .setIcon(getResources().getDrawable(R.drawable.mine_selector)));
    }

}
