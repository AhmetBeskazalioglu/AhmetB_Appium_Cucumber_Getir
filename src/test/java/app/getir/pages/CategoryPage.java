package app.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

public class CategoryPage extends BasePage{

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir")
    public AndroidElement getirLogo;

    @FindBy(xpath = "//*[@text='Dondurma']")
    public AndroidElement dondurmaButton;

    public void getCategory(String category){
        driver.findElement(By.xpath("//*[contains(text(),'" + category + "')]")).click();
    }
}
