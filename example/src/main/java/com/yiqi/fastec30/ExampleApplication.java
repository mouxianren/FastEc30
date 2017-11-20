package com.yiqi.fastec30;

import android.app.Application;

import com.joanzapata.iconify.fonts.FontAwesomeModule;
import com.yiqi.latte.app.Latte;

/**
 * Created by moumou on 17/11/20.
 */

public class ExampleApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("http://www.baidu.com")
                .withIcon(new FontAwesomeModule())
                .configure();
    }
}
