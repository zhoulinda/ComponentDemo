package com.linda.main.adapter;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.linda.base.factory.FragmentFactory;
import com.linda.main.MainFragmentFactory;

/**
 * 描述 :     主页PagerAdapter
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
public class MainFragmentPagerAdapter extends FragmentPagerAdapter {

    public MainFragmentPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        Log.e("linda", "position:   " + position);
        FragmentFactory factory = new MainFragmentFactory();
        return factory.createFragment(position);
    }

    @Override
    public int getCount() {
        return 2;
    }
}
