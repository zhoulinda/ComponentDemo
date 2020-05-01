package com.linda.login.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.linda.base.contants.RouterPaths;
import com.linda.base.ui.BaseActivity;
import com.linda.login.R;
import com.linda.login.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 描述 :    登录页
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-21
 */

@Route(path = RouterPaths.LOGIN_ACTIVITY)
public class LoginActivity extends BaseActivity {

    @BindView(R2.id.login)
    Button mLogin;
    @BindView(R2.id.loginOut)
    Button mLoginOut;
    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_login);
        unbinder = ButterKnife.bind(this);
    }

    @OnClick({R2.id.login, R2.id.loginOut})
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.login) {
            mLogin.setText("已登录");
            finish();
        } else if (viewId == R.id.loginOut) {

        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
