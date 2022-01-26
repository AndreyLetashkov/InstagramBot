package helper;

import forms.FollowersForm;
import forms.FollowingForm;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.HomePage;
import pages.LoginPage;
import pages.SearchPage;
import utils.DriverUtils;
import utils.ParserUtils;

public abstract class BaseTest {
    protected LoginPage loginPage = new LoginPage();
    protected SearchPage searchPage = new SearchPage();
    protected HomePage homePage = new HomePage();
    protected FollowingForm followingForm = new FollowingForm();
    protected FollowersForm followersForm = new FollowersForm();

    @BeforeTest
    protected void beforeTest() {
        DriverUtils.navigate(ParserUtils.parsePath("baseUrl"));
        DriverUtils.maximize();
    }

    @AfterTest
    protected void afterTest() {
        DriverUtils.quit();
    }
}