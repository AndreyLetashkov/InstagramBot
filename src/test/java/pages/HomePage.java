package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.*;

public class HomePage extends Form {
    private final IButton followingBtn = getElementFactory().getButton(By.xpath("//li[3]/a[contains(@href, following)]"),"followingBtn");

    public HomePage() { super(By.xpath("//a[text()='Edit Profile']"), "editProfileBtn"); }

    public void clickFollowingBtn() {
        followingBtn.clickAndWait();
    }
}
