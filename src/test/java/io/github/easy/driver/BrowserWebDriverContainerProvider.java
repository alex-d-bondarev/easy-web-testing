package io.github.easy.driver;

import io.github.easy.configs.ConfigProvider;
import io.github.easy.configs.TestConfig;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testcontainers.containers.BrowserWebDriverContainer;

public class BrowserWebDriverContainerProvider {

    public static BrowserWebDriverContainer get(){
        TestConfig config = ConfigProvider.getConfig();

        DesiredCapabilities browserCapabilities = new DesiredCapabilities();
        browserCapabilities.setBrowserName(config.getBrowserName());
        browserCapabilities.setVersion(config.getBrowserVersion());
        browserCapabilities.setPlatform(Platform.fromString(config.getOsName()));
        browserCapabilities.setCapability("enableVNC", true);

        return new BrowserWebDriverContainer().withCapabilities(browserCapabilities);
    }
}
