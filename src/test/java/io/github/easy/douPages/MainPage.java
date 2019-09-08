package io.github.easy.douPages;

import com.codeborne.selenide.SelenideElement;
import io.github.easy.configs.ConfigHandler;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private SelenideElement searchInput = element(By.name("q"));
    private SelenideElement alternativeSearchInput = $(By.name("q"));


    public MainPage() {
        open(ConfigHandler.getTestConfig().getBaseUrl());
    }

    public SearchPage searchFor(String value) {
        searchInput.setValue(value).pressEnter();
        return new SearchPage();
    }
}
