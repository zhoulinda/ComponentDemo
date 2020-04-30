package com.linda.pay.ui;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;
import com.linda.base.utils.StringUtil;
import com.linda.pay.R;
import com.linda.pay.R2;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 描述 :    支付页
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-21
 */

@Route(path = RouterPaths.PAY_ACTIVITY)
public class PayActivity extends AppCompatActivity {

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_activity_pay);
        unbinder = ButterKnife.bind(this);
    }

    @OnClick(R2.id.toMainActivity)
    public void onViewClicked() {
        ARouter.getInstance().build(RouterPaths.MAIN_ACTIVITY).navigation();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
