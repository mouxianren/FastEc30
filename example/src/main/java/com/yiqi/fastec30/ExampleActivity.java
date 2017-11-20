package com.yiqi.fastec30;

import com.yiqi.latte.activitys.ProxyActivity;
import com.yiqi.latte.delegates.LatteDelegate;

public class ExampleActivity extends ProxyActivity {

    @Override
    public LatteDelegate setRootDelegate() {
        return new ExampleDelegate();
    }
}
