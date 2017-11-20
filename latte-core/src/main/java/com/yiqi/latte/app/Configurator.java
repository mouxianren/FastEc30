package com.yiqi.latte.app;

import java.util.WeakHashMap;

/**
 * Created by moumou on 17/11/20.
 */

public class Configurator {
    private static final WeakHashMap<String, Object> LATTE_CONFIGS = new WeakHashMap<>();

    private Configurator() {
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(), false);
    }


    public final WeakHashMap<String, Object> getLatteConfigs() {
        return LATTE_CONFIGS;
    }

    /**
     * 静态内部类初始化
     */
    private static class Holder {
        private static final Configurator INSTANCE = new Configurator();
    }
    public static Configurator getInstance() {
        return Holder.INSTANCE;
    }




    public final void configure() {
        LATTE_CONFIGS.put(ConfigType.CONFIG_READY.name(), true);
    }

    public final Configurator withApiHost(String host) {
        LATTE_CONFIGS.put(ConfigType.API_HOST.name(), host);
        return this;
    }

    private void cheakConfiguration() {
        final boolean isReady = (boolean) LATTE_CONFIGS.get(ConfigType.CONFIG_READY.name());
        if (!isReady) {
            throw new RuntimeException("Configuration is not ready,call configure");
        }

    }

    @SuppressWarnings("unchecks")
    final <T> T getConfiguration(Enum<ConfigType> key) {
        cheakConfiguration();
        return (T) LATTE_CONFIGS.get(key.name());
    }
}
