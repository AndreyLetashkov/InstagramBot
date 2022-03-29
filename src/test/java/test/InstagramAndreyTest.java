package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;

public class InstagramAndreyTest extends BaseTest {

    @Test
    public void subscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_ANDREY"), ParserUtils.parseConfig("PASSWORD_ANDREY"));
        DriverUtils.navigate(ParserUtils.parseTestData("tutbylive"));
        searchPage.clickFollowersHref();
        followersForm.scrollDown(50);
        followersForm.subscribe(50);
    }

    @Test
    public void unsubscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_ANDREY"), ParserUtils.parseConfig("PASSWORD_ANDREY"));
        DriverUtils.navigate(ParserUtils.parsePath("homeUrlAlexifisher"));
        homePage.clickFollowingBtn();
        followingForm.scrollDown(50);
        followingForm.unSubscribe(50);
    }
}