package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;
import utils.RandomUtils;

public class InstagramVikaTest extends BaseTest {
    @Test
    public void subscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_VIKA"), ParserUtils.parseConfig("PASSWORD_VIKA"));
        DriverUtils.navigate(ParserUtils.parseTestData(RandomUtils.getRandomNumber()));
        searchPage.clickFollowersHref();
        followersForm.scrollDown(50);
        followersForm.subscribe(50);
    }
}