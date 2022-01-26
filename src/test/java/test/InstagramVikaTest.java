package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;
import utils.RandomUtils;

public class InstagramVikaTest extends BaseTest {

    /**
     * community:
     * myataBrest
     * loft_lounge_bar_brest
     * onlinebrestby
     * brestcity_news
     * brestIlovepublic
     * virtualbrest
     * wowbrest
     * <p>
     * tutbylive
     * minsk_news
     * minsk_online24
     * minskchp
     * xxminsk
     * belarus_top
     * minsk_novostnoy
     * gbminsk
     * minsk
     * news_time_minsk
     */
    @Test
    public void subscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_VIKA"), ParserUtils.parseConfig("PASSWORD_VIKA"));
        DriverUtils.navigate(ParserUtils.parseTestData(RandomUtils.getRandomNumber()));
        searchPage.clickFollowersHref();
        followersForm.scrollDown(50);
        followersForm.subscribe(50);
    }
}