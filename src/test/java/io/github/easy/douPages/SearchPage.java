package io.github.easy.douPages;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SearchPage {
    private ElementsCollection summaryResults = elements(By.className("gs-title"));

    public String getFirstResultSummary(){
        int minimumAmountOfResults = 5;

        return summaryResults.
                shouldHave(sizeGreaterThan(minimumAmountOfResults)).
                filter(visible).
                snapshot().
                first().
                getText();
    }
}
