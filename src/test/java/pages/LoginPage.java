package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class LoginPage extends Form {
    private static final String locatorField = "//input[@name='username']";
    private final ITextBox usernameTbx = getElementFactory().getTextBox(By.xpath(locatorField),"usernameTbx");
    private final ITextBox passwordTbx = getElementFactory().getTextBox(By.xpath("//input[@name='password']"),"passwordTbx");
    private final IButton logInBtn = getElementFactory().getButton(By.xpath("//*[@id='loginForm']/div/div[3]/button"),"logInBtn");
    private final IButton notNowBtn = getElementFactory().getButton(By.xpath("//button[@type='button' and text()='Not Now']"),"notNowBtn");

    public LoginPage() {
        super(By.xpath(locatorField),"Username");
    }

    public void login (String username, String password) {
        usernameTbx.type(username);
        passwordTbx.type(password);
        logInBtn.clickAndWait();
        notNowBtn.clickAndWait();
    }
}