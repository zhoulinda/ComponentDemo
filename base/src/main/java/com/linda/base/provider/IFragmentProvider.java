package com.linda.base.provider;

import androidx.fragment.app.Fragment;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * 描述 :
 *
 * @author: linda
 * email:   zhoulinda@lexue.com
 * 创建日期: 2020-04-29
 */
public interface IFragmentProvider extends IProvider {

    Fragment newInstance();
}
