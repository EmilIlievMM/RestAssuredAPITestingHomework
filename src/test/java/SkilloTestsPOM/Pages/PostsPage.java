package SkilloTestsPOM.Pages;

import SkilloTestsPOM.BaseSetup.BaseSetupSkillo;
import SkilloTestsPOM.BaseSetup.Waits;
import org.openqa.selenium.By;

public class PostsPage extends BaseSetupSkillo {
    private static final String newPostBtnName = "New post";

    public String getNewPostBtn() {
        return newPostBtnName;
    }

    // Selectors
    By newPostBtnLocator = By.xpath("//a[@id='nav-link-new-post']");

    public boolean isNewPostBtnDisplayed() {
        Waits.visibilityOfElement(driver, newPostBtnLocator);
        return driver.findElement(newPostBtnLocator).isDisplayed();
    }

    public String getDisplayedButtonName() {
        Waits.visibilityOfElement(driver, newPostBtnLocator);
        return driver.findElement(newPostBtnLocator).getText();
    }

}
