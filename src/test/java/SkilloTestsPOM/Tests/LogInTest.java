package SkilloTestsPOM.Tests;

import SkilloTestsPOM.Pages.HomePage;
import SkilloTestsPOM.Pages.LoginPage;
import SkilloTestsPOM.Pages.PostsPage;
import SkilloTestsPOM.BaseSetup.BaseSetupSkillo;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LogInTest extends BaseSetupSkillo {

    @Test
    public void logInTest() {
        driver.get("http://training.skillo-bg.com/posts/all");

        HomePage homePage = new HomePage();
        homePage.clickLogin(driver);

        LoginPage logInPage = new LoginPage();
        logInPage.setUserName("test51");
        logInPage.setPassword("test51");
        logInPage.fillSignInForm(driver);
        logInPage.clickSignInBtn(driver);

        PostsPage postsPage = new PostsPage();

        Assert.assertTrue(postsPage.isNewPostBtnDisplayed(driver));
    }
}
