package MobileTestsSelenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindCarsTest {

    @Test
    public void findCars() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mobile.bg/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebElement acceptTOSBtn = driver.findElement(By.xpath("//button[@aria-label='Към сайта']"));
        acceptTOSBtn.click();
        WebElement searchBtn = driver.findElement(By.xpath("//a[contains(text(),'Търсене')]"));
        searchBtn.click();

        Select vehicleCategory = new Select(driver.findElement(By.xpath("//select[@class='sw300new']")));
        vehicleCategory.selectByVisibleText("Автомобили и Джипове");
        Select oldest = new Select(driver.findElement(By.xpath("//select[@name='f10']")));
        oldest.selectByValue("2010");
        Select newest = new Select(driver.findElement(By.xpath("//select[@name='f11']")));
        newest.selectByValue("2022");

        Select sortBy = new Select(driver.findElement(By.xpath("//select[@name='f20']")));
        sortBy.selectByValue("3");

        WebElement lowestPrice = driver.findElement(By.xpath("//input[@name='f7']"));
        lowestPrice.sendKeys("30000");
        WebElement highestPrice = driver.findElement(By.xpath("//input[@name='f8']"));
        highestPrice.sendKeys("70000");

        WebElement lowestHP = driver.findElement(By.xpath("//input[@name='f25']"));
        lowestHP.sendKeys("200");
        WebElement highestHP = driver.findElement(By.xpath("//input[@name='f26']"));
        highestHP.sendKeys("400");

        Select vehicleType = new Select(driver.findElement(By.xpath("//select[@name='f14']")));
        vehicleType.selectByValue("Джип");

        Select fuel = new Select(driver.findElement(By.xpath("//select[@name='f12']")));
        fuel.selectByValue("Бензинов");

        Select gearBox = new Select(driver.findElement(By.xpath("//select[@name='f13']")));
        gearBox.selectByValue("Автоматична");

        WebElement fourByFour = driver.findElement(By.xpath("//img[@id='eimg82']"));
        fourByFour.click();
        WebElement fourDoors = driver.findElement(By.xpath("//img[@id='eimg101']"));
        fourDoors.click();
        WebElement rightHandDriveOff = driver.findElement(By.xpath("//img[@id='eimg123']"));
        rightHandDriveOff.click();
        rightHandDriveOff.click();

        WebElement crashedFalse = driver.findElement(By.xpath("//img[@id='eimg89']"));
        crashedFalse.click();
        crashedFalse.click();

        WebElement searchBtnInSearchPage = driver.findElement(By.xpath("//input[@value='Т Ъ Р С И']"));
        searchBtnInSearchPage.click();

        //ToDo could add some soft asserts

        Assert.assertEquals("Автомобили и Джипове", driver.findElement(By.xpath("//b[contains(text(),'Автомобили и Джипове')]")).getText());
        Assert.assertEquals("4(5) Врати", driver.findElement(By.xpath("//tbody/tr/td/b[contains(text(),'4(5) Врати')]")).getText());
        Assert.assertEquals("Автоматична", driver.findElement(By.xpath("//tbody/tr/td/b[contains(text(),'Автоматична')]")).getText());


        driver.close();
    }

}
