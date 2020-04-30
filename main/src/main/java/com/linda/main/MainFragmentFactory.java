package com.linda.main;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;
import com.linda.base.factory.FragmentFactory;
import com.linda.base.provider.IFragmentProvider;
import com.linda.base.utils.ARouterHelper;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
public class MainFragmentFactory implements FragmentFactory {

    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
//                fragment = ((IFragmentProvider) ARouter.getInstance().build(RouterPaths.HOME_FRAGMENT_PROVIDER).navigation()).newInstance();
                fragment = ARouterHelper.getFragment(RouterPaths.HOME_FRAGMENT);
                break;
            case 1:
//                fragment = ((FragmentProvider) ARouter.getInstance().build(RouterPaths.MINE_FRAGMENT_PROVIDER).navigation()).newInstance();
                fragment = ARouterHelper.getFragment(RouterPaths.MINE_FRAGMENT);
                break;
        }
        return fragment;
    }

    @Override
    public void init(Context context) {

    }
}
