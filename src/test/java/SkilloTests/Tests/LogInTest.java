package SkilloTests.Tests;

import SkilloTests.Pages.HomePage;
import SkilloTests.Pages.LoginPage;
import SkilloTests.Pages.PostsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public abstract class LogInTest extends BaseSetupSkillo {

    @Test
    void logInTest() {
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
