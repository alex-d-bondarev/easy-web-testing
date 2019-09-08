package io.github.easy.configs;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/test/resources/test.properties")
public interface TestConfig extends Config {

    @Key("dou.main.page.url")
    String getBaseUrl();
}
