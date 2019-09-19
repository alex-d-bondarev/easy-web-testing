package io.github.easy.douPages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {

    private ElementsCollection summaryResults = elements(By.className("gs-title"));

    public String getFirstResultSummary(){
        int amountOfHiddenResults = 2;

        return summaryResults.
                shouldHave(sizeGreaterThan(amountOfHiddenResults)).
                filter(visible).
                snapshot().
                first().
                getText();
    }
}
