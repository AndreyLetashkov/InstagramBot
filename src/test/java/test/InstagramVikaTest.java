package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;

public class InstagramVikaTest extends BaseTest {

    @Test
    public void unsubscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_VIKA"), ParserUtils.parseConfig("PASSWORD_VIKA"));
        DriverUtils.navigate(ParserUtils.parsePath("homeUrlLevinails"));
        homePage.clickFollowingBtn();
        followingForm.scrollDown(50);
        followingForm.unSubscribe(50);
    }
}