package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@DefaultUrl("https://www.amazon.com/")
public class AmazonHomePage extends PageObject {

    @FindBy(xpath="//a[contains(@href, '/ref=nav_logo')]")
    WebElementFacade amazonLogo;

    @FindBy(id="twotabsearchtextbox")
    WebElementFacade searchBox;

    @FindBy(xpath="//div[@id='search']/div/div/div/span/div/div/div/span/div/div/span")
    WebElementFacade resultsHeader;

//    @FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[2]/div[1]/h2/a/span")
//    WebElementFacade firstProdDescription;

    @FindBy(css = "[data-cy='title-recipe']")
    List<WebElementFacade> prodDescriptions;


    public void navigateToAmazonPage() {
        open();
    }

    public void nagivationShouldBeVisible() {
        amazonLogo.shouldBeVisible();
        searchBox.shouldBeVisible();
    }

    public void searchFor(String searchTerm) {
        searchBox.typeAndEnter(searchTerm);
    }

    public void searchResultsPageIsDisplayed() {
        resultsHeader.shouldBeVisible();
        assertFalse(prodDescriptions.isEmpty());
    }

}
