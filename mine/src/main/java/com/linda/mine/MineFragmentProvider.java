package com.linda.mine;

import android.content.Context;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.linda.base.contants.RouterPaths;
import com.linda.base.provider.IFragmentProvider;
import com.linda.mine.ui.MineFragment;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
@Route(path = RouterPaths.MINE_FRAGMENT_PROVIDER)
public class MineFragmentProvider implements IFragmentProvider {

    @Override
    public Fragment newInstance() {
        return MineFragment.newInstance();
    }

    @Override
    public void init(Context context) {

    }
}
