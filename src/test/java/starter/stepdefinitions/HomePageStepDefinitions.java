package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import starter.navigation.PublixHomePage;

public class HomePageStepDefinitions {

    PublixHomePage publixHomePage;

    @Given("^user is on the hompage$")
    public void user_is_on_the_home_page() {
        publixHomePage.navigatetoPublixPage();
    }
}
