package starter.navigation;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;

@DefaultUrl("https://www.publix.com/")
public class PublixHomePage extends PageObject {

    public void navigatetoPublixPage() {
        open();
    }
}
