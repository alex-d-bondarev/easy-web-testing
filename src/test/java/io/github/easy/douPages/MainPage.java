package io.github.easy.douPages;

import com.codeborne.selenide.SelenideElement;
import io.github.easy.configs.ConfigProvider;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement searchInput = element(By.name("q"));
    private SelenideElement alternativeSearchInput = $(By.name("q"));


    public MainPage() {
        open(ConfigProvider.getConfig().getBaseUrl());
        System.out.println(
                "Browser: " + executeJavaScript("return navigator.userAgent"));
    }

    public SearchPage searchFor(String value) {
        searchInput.setValue(value).pressEnter();
        return new SearchPage();
    }
}
