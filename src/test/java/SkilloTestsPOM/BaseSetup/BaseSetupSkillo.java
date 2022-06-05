package SkilloTestsPOM.BaseSetup;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

public class BaseSetupSkillo {

    public static WebDriver driver;

    @BeforeClass

    public static void  setupTest() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
    }

    @AfterEach
     public static void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}