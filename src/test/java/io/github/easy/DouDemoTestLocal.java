package io.github.easy;

import io.github.easy.douPages.MainPage;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class DouDemoTestLocal {

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
