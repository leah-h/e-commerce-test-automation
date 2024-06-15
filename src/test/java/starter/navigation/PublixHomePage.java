package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

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

    @FindBy(css = "[data-qa-automation='prod-title']")
    private List<WebElementFacade> productTitles;

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

    public boolean isFirstTitleContainsKeyword(String keyword) {
        if (!productTitles.isEmpty()) {
            String firstTitleText = productTitles.get(0).getText();
            return firstTitleText.contains(keyword);
        }
        return false;
    }

    public void searchResultsPageIsDisplayed() {
        productCardHeader.shouldBeVisible();
    }

}
