package io.github.easy.configs;

import org.aeonbits.owner.ConfigFactory;

public class ConfigProvider {
    public static TestConfig getConfig(){
        return ConfigFactory.create(TestConfig.class);
    }
}
