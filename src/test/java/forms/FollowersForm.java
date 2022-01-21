package forms;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class FollowersForm extends Form {
    private IButton followButton;

    public FollowersForm() { super(By.xpath("//h1[text()='Followers']"), "FollowersLabel"); }

    private ILink getLi(String index) {
        return getElementFactory().getLink(By.xpath(String.format("/html/body/div[6]/div/div/div[2]/ul/div/li[%s]", index)), "Li");
    }

    public void scrollDown(int index) {
        for (int i = 1; i <= index; i++) {
            getLi(String.valueOf(i)).getJsActions().scrollIntoView();
        }
    }

    private IButton getFollowBtn(String index) {
        return getElementFactory().getButton(By.xpath(String.format("/html/body/div[6]/div/div/div[2]/ul/div/li[%s]/div//button", index)), "Follow button");
    }

    public void subscribe(int index) {
        for (int i = 1; i <= index; i++) {
            if (i == index / 2 || i == index / 4) {
                followButton.state().waitForDisplayed();
            }
            followButton = getFollowBtn(String.valueOf(i));
            if (followButton.getText().equals("Requested") || followButton.getText().equals("Following")) {
                continue;
            }
            followButton.click();
        }
    }
}