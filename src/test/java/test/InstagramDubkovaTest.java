package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;
import utils.RandomUtils;

public class InstagramDubkovaTest extends BaseTest {

    @Test
    public void subscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_DUBKOVA"), ParserUtils.parseConfig("PASSWORD_DUBKOVA"));
        DriverUtils.navigate(ParserUtils.parseTestData(RandomUtils.getRandomNumber()));
        searchPage.clickFollowersHref();
        followersForm.scrollDown(50);
        followersForm.subscribe(50);
    }
}