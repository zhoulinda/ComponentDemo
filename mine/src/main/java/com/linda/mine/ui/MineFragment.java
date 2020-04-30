package com.linda.mine.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.linda.base.contants.RouterPaths;
import com.linda.base.ui.BaseFragment;
import com.linda.mine.R;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
@Route(path = RouterPaths.MINE_FRAGMENT)
public class MineFragment extends BaseFragment {

    public static Fragment newInstance() {
        return new MineFragment();
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.mine_fragment_mine, null);
        return rootView;
    }
}
