package SkilloTestsPOM.Pages;

import SkilloTestsPOM.BaseSetup.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PostsPage extends BaseSetupSkillo {
    private static final String newPostBtnName = "New Posts";

    // Selectors
    By newPostBtn = By.xpath("//ul[@class='navbar-nav']//a[@id='nav-link-login']");

    public boolean isNewPostBtnDisplayed(WebDriver driver) {
        return driver.findElement(newPostBtn).isDisplayed();
    }

}
