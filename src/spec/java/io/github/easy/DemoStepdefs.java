package io.github.easy;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.easy.douPages.MainPage;
import io.github.easy.douPages.SearchPage;
import org.hamcrest.CoreMatchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class DemoStepdefs {
    @Given("open DOU main page")
    public void openDOUMainPage() {
        new MainPage().openPage();
    }

    @When("search for (.*)")
    public void searchForSelenide(String text) {
        new MainPage().searchFor(text);
    }

    @Then("first visible result should have (.*) in summary")
    public void firstVisibleResultShouldHaveSelenideInSummary(String text) {
        assertThat(new SearchPage().getFirstResultSummary(),
                CoreMatchers.containsString(text));
    }
}
