package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.navigation.PublixHomePage;

import static org.junit.Assert.assertTrue;

public class PublixHomePageStepDefinitions {

    PublixHomePage publixHomePage;

    @Managed
    WebDriver driver;


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

    @When("^the search results page is displayed with (.*)$")
    public void searchResultsPageIsDisplayed(String keyword) {
        publixHomePage.searchResultsPageIsDisplayed();
        publixHomePage.keywordShouldBeVisibleInFirstProductTitle(keyword);
    }


}
