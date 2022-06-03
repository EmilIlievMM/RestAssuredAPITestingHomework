package SkilloTests.Pages;

import SkilloTests.Tests.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostsPage extends BaseSetupSkillo {
    private static final String newPostBtnName = "New Posts";

    // Selectors
    By newPostBtn = By.id("nav-link-new-post");

    public boolean isNewPostBtnDisplayed(WebDriver driver) {
        return driver.findElement(newPostBtn).isDisplayed();
    }

}
