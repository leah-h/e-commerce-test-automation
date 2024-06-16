package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;

import static org.junit.Assert.assertTrue;

@DefaultUrl("https://www.publix.com/")
public class PublixHomePage extends PageObject {

    @FindBy(css= ".site-navigation")
    private WebElementFacade siteNavigation;

    @FindBy(css = ".navigation-search")
    private WebElementFacade searchField;

    @FindBy(id = "searchInputFlyoutMobile")
    private WebElementFacade searchBox;

    @FindBy(css = ".user-navigation .account")
    private WebElementFacade userAccountNaivgation;

    @FindBy(css = "[data-qa-automation='product-card-header']")
    private WebElementFacade productCardHeader;

    @FindBy(css =".p-grid-item:nth-child(1) .title-wrapper > .p-text")
    private WebElementFacade firstProductTitle;

    @FindBy(css = ".p-store-locator")
    private WebElementFacade storeLocatorPopup;

    public void navigatetoPublixPage() {
        open();
    }

    public void nagivationShouldBeVisible() {
        siteNavigation.shouldBeVisible();
        searchField.shouldBeVisible();
        userAccountNaivgation.shouldBeVisible();
    }

    public void searchFor(String keyword) {
        searchBox.type(keyword);
        searchBox.submit();
    }

    public void dismissStoreLocatorPopupIfVisible() throws NoAlertPresentException {
        if (storeLocatorPopup.isVisible()) {
            // Switch to the alert
            Alert alert = getDriver().switchTo().alert();

            // Dismiss the alert
            alert.dismiss();
        }
    }


    public void searchResultsPageIsDisplayed() {
        productCardHeader.shouldBeVisible();
    }


    public void keywordShouldBeVisibleInFirstProductTitle(String keyword) {
        dismissStoreLocatorPopupIfVisible();
       assertTrue(firstProductTitle.getText().toLowerCase().contains(keyword.toLowerCase()));

    }

}
