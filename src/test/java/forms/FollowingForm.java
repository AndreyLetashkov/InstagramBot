package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FollowingForm extends Form {
    private IButton followBtn;
    private final IButton unfollowBtn = getElementFactory().getButton(By.xpath("//button[text()='Unfollow']"), "unfollowBtn");

    public FollowingForm() { super(By.xpath("//span[text()='Hashtags']"), "Hashtags"); }

    private ILink getLi(String index) {
        return getElementFactory().getLink(By.xpath(String.format("/html/body/div[6]/div/div/div[3]/ul/div/li['%s']", index)),"Li");
    }

    public void scrollDown(int index) {
        for (int i = 1; i <= index; i++) {
            getLi(String.valueOf(i)).getJsActions().scrollIntoView();
        }
    }

    private IButton getFollowBtn(String index) {
        return getElementFactory().getButton(By.xpath(String.format("(//li//button)[%s]", index)), "followBtn");
    }

    public void unSubscribe(int index) {
        for (int i = 1; i <= index; i++) {
            if (i == index / 2 || i == index / 4) {
                followBtn.state().waitForDisplayed();
            }
            followBtn = getFollowBtn(String.valueOf(i));
            followBtn.clickAndWait();
            unfollowBtn.clickAndWait();
        }
    }
}