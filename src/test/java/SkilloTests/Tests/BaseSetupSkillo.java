package SkilloTests.Tests;

import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseSetupSkillo {

    public WebDriver driver;

    @BeforeClass
    void setupTest() {
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }


    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

}