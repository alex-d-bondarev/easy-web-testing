package io.github.easy.douPages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {

    private static final String DOU_URL = "https://dou.ua/";

    private SelenideElement searchInput = element(By.name("q"));
    private SelenideElement alternativeSearchInput = $(By.name("q"));

    public SearchPage searchFor(String value){
        searchInput.setValue(value).pressEnter();

        return new SearchPage();
    }

    public static MainPage navigate(){
        open(DOU_URL);

        return new MainPage();
    }
}
