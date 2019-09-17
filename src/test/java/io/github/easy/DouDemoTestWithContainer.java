package io.github.easy;

import com.codeborne.selenide.WebDriverRunner;
import io.github.easy.douPages.MainPage;
import io.github.easy.driver.BrowserWebDriverContainerProvider;
import org.hamcrest.CoreMatchers;
import org.junit.Rule;
import org.junit.jupiter.api.*;
import org.testcontainers.containers.BrowserWebDriverContainer;

import static org.hamcrest.MatcherAssert.assertThat;

public class DouDemoTestWithContainer {

    @Rule
    public BrowserWebDriverContainer browserContainer = BrowserWebDriverContainerProvider.get();

    @BeforeEach
    public void setUp() {
        browserContainer.start();
        WebDriverRunner.setWebDriver(browserContainer.getWebDriver());
    }

    @AfterEach
    public void tearDown() {
        WebDriverRunner.closeWebDriver();
        browserContainer.stop();
    }

    @Test
    public void searchDouForSelenide(){
        String searchText = "Selenide";

        assertThat(
                new MainPage().
                        openPage().
                        searchFor(searchText).
                        getFirstResultSummary(),

                CoreMatchers.containsString(searchText));
    }

}
