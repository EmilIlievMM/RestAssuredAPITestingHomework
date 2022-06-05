package SkilloTestsPOM.BaseSetup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waits extends BaseSetupSkillo {

    public static void implicitWait(int seconds) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
// Explicit Wait
    public static void visibilityOfElement(WebDriver driver, By by) {
        WebElement result = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    //ToDo FluentWait



}
