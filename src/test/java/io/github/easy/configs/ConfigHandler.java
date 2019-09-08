package io.github.easy.configs;

import org.aeonbits.owner.ConfigFactory;

public class ConfigHandler {
    public static TestConfig getTestConfig(){
        return ConfigFactory.create(TestConfig.class);
    }
}
