package io.github.easy.configs;

import org.aeonbits.owner.Config;

@Config.Sources("file:src/test/resources/test.properties")
public interface TestConfig extends Config {

    @Key("dou.main.page.url")
    String getBaseUrl();

    /*
     * List of supported Selenoid browsers, versions and platforms can be found here
     * (some of them did not work for me though):
     * https://aerokube.com/selenoid/latest/#_browser_image_information
     * https://github.com/aerokube/cm/releases/
     * https://github.com/SeleniumHQ/selenium/wiki/DesiredCapabilities
     * */
    @Key("browser.name")
    String getBrowserName();

    @Key("browser.version")
    String getBrowserVersion();

    @Key("platform.name")
    String getOsName();
}
