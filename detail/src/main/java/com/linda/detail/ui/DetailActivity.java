package com.linda.detail.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;
import com.linda.base.provider.IMineDataProvider;
import com.linda.base.ui.BaseActivity;
import com.linda.detail.R;
import com.linda.detail.R2;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-29
 */
@Route(path = RouterPaths.DETAIL_ACTIVITY)
public class DetailActivity extends BaseActivity {

    @BindView(R2.id.getMineData)
    Button mGetMineData;
    @BindView(R2.id.pay)
    Button mPay;

    private Unbinder unbinder;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity_detail);
        unbinder = ButterKnife.bind(this);
    }

    @OnClick({R2.id.getMineData, R2.id.pay})
    public void onClick(View view) {
        int viewId = view.getId();
        if (viewId == R.id.getMineData) {
            IMineDataProvider mineDataProvider = (IMineDataProvider) ARouter.getInstance().build(RouterPaths.MINE_DATA_PROVIDER).navigation();
            if (mineDataProvider != null) {
                mGetMineData.setText(mineDataProvider.getMineData());
            }
        } else if (viewId == R.id.pay) {
            ARouter.getInstance().build(RouterPaths.PAY_ACTIVITY).navigation();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbinder.unbind();
    }
}
