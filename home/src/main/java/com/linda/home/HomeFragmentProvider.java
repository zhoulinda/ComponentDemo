package com.linda.home;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.linda.base.contants.RouterPaths;
import com.linda.base.provider.IFragmentProvider;
import com.linda.home.ui.HomeFragment;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
@Route(path = RouterPaths.HOME_FRAGMENT_PROVIDER)
public class HomeFragmentProvider implements IFragmentProvider {

    @Override
    public Fragment newInstance() {
        return HomeFragment.newInstance();
    }

    @Override
    public void init(Context context) {

    }
}
