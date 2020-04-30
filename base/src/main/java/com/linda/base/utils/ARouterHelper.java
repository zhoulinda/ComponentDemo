package com.linda.base.utils;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * 描述 :    ARouter帮助类
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
public class ARouterHelper {

    public static Fragment getFragment(String path) {
        return (Fragment) ARouter.getInstance().build(path).navigation();
    }
}
