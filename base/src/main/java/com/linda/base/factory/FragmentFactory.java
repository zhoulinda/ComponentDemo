package com.linda.base.factory;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-28
 */
public interface FragmentFactory extends IProvider {

    Fragment createFragment(int position);
}
