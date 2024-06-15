package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.PublixHomePage;

public class HomePageStepDefinitions {

    PublixHomePage publixHomePage;

    @Given("^user is on the Publix landing page$")
    public void navigateToHome() {
        publixHomePage.navigatetoPublixPage();
    }

    @Then("^the landing page should display correctly$")
    public void landingPageIsDisplayed() {
        publixHomePage.nagivationShouldBeVisible();
    }

    @When("^the user searches for (.*)$")
    public void searchForKeyword(String keyword) {
        publixHomePage.searchFor(keyword);
    }

    @When("^the search results page is displayed$")
    public void searchResultsPageIsDisplayed() {
        publixHomePage.searchResultsPageIsDisplayed();
    }
}
