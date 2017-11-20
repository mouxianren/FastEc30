package com.yiqi.fastec30;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.TextView;

import com.yiqi.latte.delegates.LatteDelegate;

import butterknife.BindView;

/**
 * Created by moumou on 17/11/20.
 */

public class ExampleDelegate extends LatteDelegate {
    @BindView(com.yiqi.fastec30.R.id.tv_test)
    TextView mTvTest;


    @Override
    public Object setLayout() {
        return R.layout.delegate_example;
    }

    @Override
    public void onBindView(@Nullable Bundle savedInstanceState, View rootView) {

    }

    @Override
    public void initData() {
    }
}
