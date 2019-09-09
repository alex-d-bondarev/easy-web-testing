Feature: this is a simple demo test that replicates the ones from /test folder

  Scenario: Search DOU for Selenide
    Given open DOU main page
    When search for Selenide
    Then first visible result should have Selenide in summary
