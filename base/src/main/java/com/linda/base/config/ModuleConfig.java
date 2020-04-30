package com.linda.base.config;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-23
 */
public interface ModuleConfig {

    String LOGIN = "com.linda.login.LoginApplication";

    String DETAIL = "com.linda.detail.DetailApplication";

    String PAY = "com.linda.pay.PayApplication";

    String[] modules = {
            LOGIN, DETAIL, PAY
    };

}
