package test;

import helper.BaseTest;
import org.testng.annotations.Test;
import utils.DriverUtils;
import utils.ParserUtils;

public class InstagramDubkovaTest extends BaseTest {
    /**
     * zdorovei_naroch
     * nanosy_otdyh
     * usadby_by
     * dvor_bel
     * agrousadba_naturlich
     * am555_by
     * eco_ysadba
     * routebelarus
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
        loginPage.login(ParserUtils.parseConfig("USERNAME_DUBKOVA"), ParserUtils.parseConfig("PASSWORD_DUBKOVA"));
        DriverUtils.navigate(ParserUtils.parseTestData("nanosy_otdyh"));
        searchPage.clickFollowersHref();
        followersForm.scrollDown(50);
        followersForm.subscribe(50);
    }

    @Test
    public void unsubscribeTest() {
        loginPage.login(ParserUtils.parseConfig("USERNAME_ANDREY"), ParserUtils.parseConfig("PASSWORD_ANDREY"));
        DriverUtils.navigate(ParserUtils.parsePath(""));
        homePage.clickFollowingBtn();
        followingForm.scrollDown(50);
        followingForm.unSubscribe(50);
    }
}