package com.linda.mine;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.linda.base.contants.RouterPaths;
import com.linda.base.provider.IMineDataProvider;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-29
 */

@Route(path = RouterPaths.MINE_DATA_PROVIDER)
public class MineDataProvider implements IMineDataProvider {

    @Override
    public String getMineData() {
        return "***已获取到mine模块中的数据***";
    }

    @Override
    public void init(Context context) {

    }
}
