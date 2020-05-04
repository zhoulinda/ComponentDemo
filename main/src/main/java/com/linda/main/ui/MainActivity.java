package com.linda.main.ui;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;
import com.linda.base.utils.ARouterHelper;
import com.linda.main.R;
import com.linda.main.R2;
import com.linda.main.adapter.MainFragmentPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

@Route(path = RouterPaths.MAIN_ACTIVITY)
public class MainActivity extends AppCompatActivity {

    @BindView(R2.id.viewPager)
    ViewPager mViewPager;

    private Unbinder unbinder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity_main);
        unbinder = ButterKnife.bind(this);

        MainFragmentPagerAdapter pagerAdapter = new MainFragmentPagerAdapter(getSupportFragmentManager(), 0);
        mViewPager.setAdapter(pagerAdapter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
