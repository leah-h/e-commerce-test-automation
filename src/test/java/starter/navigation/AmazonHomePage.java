package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.amazon.com/")
public class AmazonHomePage extends PageObject {

    public void navigateToAmazonPage() {
        open();
    }

    public void nagivationShouldBeVisible() {
        // Add code here
    }

    public void searchFor(String keyword) {
        // Add code here
    }

    public void searchResultsPageIsDisplayed() {
        // Add code here
    }

    public void keywordShouldBeVisibleInFirstProductTitle(String keyword) {
        // Add code here
    }
}
