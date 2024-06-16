package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.navigation.AmazonHomePage;

import static org.junit.Assert.assertTrue;

public class AmazonHomePageStepDefinitions {

    AmazonHomePage amazonHomePage;

    @Given("^user is on the Amazon landing page$")
    public void navigateToAmazonHome() {
        amazonHomePage.navigateToAmazonPage();
        amazonHomePage.nagivationShouldBeVisible();
    }

    @When("^user searches for (.*)$")
    public void searchFor(String searchTerm) {
        amazonHomePage.searchFor(searchTerm);
    }

    @Then("^the search results page is displayed with (.*)$")
    public void searchResultsPageIsDisplayed(String searchTerm) {
        amazonHomePage.searchResultsPageIsDisplayed();
//        amazonHomePage.searchTermShouldBeVisibleInFirstProductTitle(searchTerm);
    }
}
