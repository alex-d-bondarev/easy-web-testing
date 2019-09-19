package io.github.easy;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import io.github.easy.configs.ConfigProvider;
import io.github.easy.douPages.MainPage;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class DouDemoTestLocal {

    @Test
    public void searchDouForSelenideRaw(){
        String searchText = "Selenide";

        Configuration.browser = "safari";

        element(By.name("q")).
                setValue(searchText).
                pressEnter();

        assertThat(
                elements(By.className("gs-title")).
                        // That is dou.ua behavior. At fist 2 hidden results appear. Need to wait for more.
                        shouldHave(sizeGreaterThan(2)).
                        snapshot().
                        filter(visible).
                        first().
                        getText(),

        CoreMatchers.containsString(searchText));
    }


    @Test
    public void searchDouForSelenide(){
        String searchText = "Selenide";

        Configuration.browser = "safari";

        assertThat(
                new MainPage().
                        openPage().
                        searchFor(searchText).
                        getFirstResultSummary(),

                CoreMatchers.containsString(searchText));
    }
}
