package app.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//*[@text='username']")
    public AndroidElement usernameInput;
    @FindBy(xpath = "//*[@text='password']")
    public AndroidElement passwordInput;
    @FindBy(xpath = "//*[@text='Submit']")
    public AndroidElement submitBtn;


    public void login(String username,String password){
        waitUntil(usernameInput).sendKeys(username);
        passwordInput.sendKeys(password);
        submitBtn.click();
    }

}
