package com.linda.home.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.linda.base.contants.RouterPaths;
import com.linda.base.ui.BaseFragment;
import com.linda.home.R;
import com.linda.home.R2;

import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
@Route(path = RouterPaths.HOME_FRAGMENT)
public class HomeFragment extends BaseFragment {

    private Unbinder unbinder;

    public static Fragment newInstance() {
        return new HomeFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.home_fragment_home, null);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @OnClick(R2.id.open_detail)
    public void onClick() {
        ARouter.getInstance().build(RouterPaths.DETAIL_ACTIVITY).navigation();
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

}
