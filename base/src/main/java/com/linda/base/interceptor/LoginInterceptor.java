package com.linda.base.interceptor;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;

/**
 * 描述 :     登录拦截器
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-05-01
 */

@Interceptor(priority = 10, name = "login_interceptor")
public class LoginInterceptor implements IInterceptor {

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        //拦截跳转，进行一些处理
        if (postcard.getPath().equals(RouterPaths.PAY_ACTIVITY)) {
            Log.e("linda", LoginInterceptor.class.getName() + " 进行了拦截处理！");
//            if (true) {//已登录
//                //交还控制权
//                callback.onContinue(postcard);
//            } else {//进行拦截
            ARouter.getInstance().build(RouterPaths.LOGIN_ACTIVITY).navigation();
            callback.onContinue(postcard);
//            }
        } else {
            //交还控制权
            callback.onContinue(postcard);
        }
    }

    @Override
    public void init(Context context) {

    }
}
