package app.getir.pages;

import app.getir.step_definitions.Initialize;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public AppiumDriver<MobileElement> driver;
    public WebDriverWait wait;

    public BasePage() {
        this.driver= Initialize.driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver),this);
        wait=new WebDriverWait(driver,10);
    }

    public AndroidElement waitUntil(AndroidElement element){
        return (AndroidElement) wait.until(ExpectedConditions.visibilityOf(element));
    }
}
