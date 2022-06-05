package SkilloTestsPOM.Pages;

import SkilloTestsPOM.BaseSetup.Waits;
import SkilloTestsPOM.BaseSetup.BaseSetupSkillo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BaseSetupSkillo {
    private String userName;
    private String password;

    // Selectors
    By userNameField = By.xpath("//input[@id='defaultLoginFormUsername']");
    By passwordField = By.xpath("//input[@id='defaultLoginFormPassword']");
    By signInBtn = By.xpath("//form//button[@id='sign-in-button']");

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
        Waits.visibilityOfElement(driver, userNameField);
        Waits.visibilityOfElement(driver, passwordField);
        driver.findElement(userNameField).sendKeys(userName);
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickSignInBtn(WebDriver driver) {
        driver.findElement(signInBtn).click();
    }

}

