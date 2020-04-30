package com.linda.base;

import android.app.Application;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.config.ModuleConfig;

/**
 * 描述 :
 * <p>
 * 1、初始化各个子module的Application
 * 2、各个子module都依赖了BaseModule,所以可以在BaseApplication做一些公共的处理
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-23
 */
public abstract class BaseApplication extends Application implements BaseApplicationImpl {

    @Override
    public void onCreate() {
        super.onCreate();
        initComponent();
        initARouter();
    }

    /**
     * 初始化各组件
     */
    public void initComponent() {
        for (String module : ModuleConfig.modules) {
            try {
                Class clazz = Class.forName(module);
                BaseApplicationImpl baseApplication = (BaseApplicationImpl) clazz.newInstance();
                baseApplication.init();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 初始化ARouter
     */
    private void initARouter() {
        if (isDebug()) {
            ARouter.openLog();
            ARouter.openDebug();
        }
        ARouter.init(this);
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
