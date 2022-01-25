package utils;

import aquality.selenium.browser.AqualityServices;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import java.util.ArrayList;
import java.util.List;
import static aquality.selenium.browser.AqualityServices.getBrowser;

public class DriverUtils {

    public static void navigate(String url){
        getBrowser().goTo(url);
    }

    public static void maximize() {
        getBrowser().maximize();
    }

    public static void refresh() {
        getBrowser().refresh();
    }

    public static void back() { getBrowser().goBack(); }

    public static int getNumbersWindows() {
        return new ArrayList(getBrowser().getDriver().getWindowHandles()).size();
    }

    public static void addCookie(String name, String value){ getBrowser().getDriver().manage().addCookie(new Cookie(name, value)); }

    public static String getScreenshot() { return getBrowser().getDriver().getScreenshotAs(OutputType.BASE64); }

    public static void closePopUp(){
        getBrowser().getDriver().executeScript("window.close()");
        switchToAnotherWindow(0);
    }

    public static void switchToAnotherWindow(int numberOfTab){
        List<String> windows = new ArrayList(getBrowser().getDriver().getWindowHandles());
        getBrowser().getDriver().switchTo().window(windows.get(numberOfTab));
    }

    public static void quit() {
        if (AqualityServices.isBrowserStarted()) {
            getBrowser().quit();
        }
    }
}