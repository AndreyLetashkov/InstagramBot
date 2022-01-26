package pages;

import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class SearchPage extends Form {
    private final ILink followersLink = getElementFactory().getLink(By.xpath("//div[@id='react-root']/section/main/div/header/section/ul/li[2]/a"), "FollowersLink");

    public SearchPage() { super(By.xpath("//a[text()=' followers']"), "FollowersLabel"); }

    public void clickFollowersHref() {
        followersLink.click();
    }
}
