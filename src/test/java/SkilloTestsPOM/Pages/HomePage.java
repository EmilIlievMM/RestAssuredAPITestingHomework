package SkilloTestsPOM.Pages;

import SkilloTestsPOM.BaseSetup.Waits;
import SkilloTestsPOM.BaseSetup.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BaseSetupSkillo {

    // Selectors
    By loginButton = By.xpath("//ul[@class='navbar-nav']//a[@id='nav-link-login']");

    // Methods
    public void clickLogin(WebDriver driver) {
        Waits.visibilityOfElement(driver, loginButton);
        driver.findElement(loginButton).click();
    }

}
