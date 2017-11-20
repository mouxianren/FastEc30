package com.yiqi.latte.app;

import android.content.Context;

import java.util.WeakHashMap;

/**
 * Created by moumou on 17/11/20.
 */

public final class Latte {
    public static Configurator init(Context context){
        getConfiguration().put(ConfigType.APPLICATION_CONTEXT.name(),context.getApplicationContext());
        return Configurator.getInstance();

    }
    private static WeakHashMap<String,Object> getConfiguration(){
        return Configurator.getInstance().getLatteConfigs();
    }

}
