package SkilloTests.Pages;

import SkilloTests.Tests.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends BaseSetupSkillo {
    private String userName;
    private String password;

    // Selectors
    By userNameField = By.id("defaultLoginFormUsername");
    By passwordField = By.id("defaultLoginFormPassword");
    By signInBtn = By.id("sign-in-button");

    // Setters and Getters
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Methods
    public void fillSignInForm(WebDriver driver) {
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInBtn(WebDriver driver) {
        driver.findElement(signInBtn).click();
    }

}

