package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import starter.navigation.AmazonHomePage;

public class AmazonHomePageStepDefinitions {

    AmazonHomePage amazonHomePage;

    @Given("^user is on the Amazon landing page$")
    public void navigateToAmazonHome() {
        amazonHomePage.navigateToAmazonPage();
    }
}
