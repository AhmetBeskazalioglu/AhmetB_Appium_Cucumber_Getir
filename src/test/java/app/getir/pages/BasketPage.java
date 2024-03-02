package app.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class BasketPage extends BasePage{
    @FindBy(xpath = "//*[@text='There is no result']")
    public AndroidElement emptyBasketText;
    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_leftIconImageView")
    public AndroidElement backBtn;

}
