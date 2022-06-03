package SkilloTests.Pages;

import SkilloTests.Tests.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePage extends BaseSetupSkillo {

    // Selectors
    By loginButton = By.id("nav-link-login");

    // Methods
    public void clickLogin(WebDriver driver) {
        driver.findElement(loginButton).click();
    }

}
