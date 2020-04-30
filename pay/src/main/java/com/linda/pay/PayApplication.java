package com.linda.pay;

import android.util.Log;

import com.linda.base.BaseApplication;

/**
 * 描述 :
 * <p>
 * 1、PayApplication中只做一些与Pay相关的处理
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-23
 */
public class PayApplication extends BaseApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        Log.e("linda", "******PayApplication******onCreate");
    }

    @Override
    public void init() {
        Log.e("linda", "******PayApplication******");
    }
}
