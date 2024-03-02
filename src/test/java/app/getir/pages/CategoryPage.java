package app.getir.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends BasePage{

    @FindBy(id = "com.getir.casestudy.dev:id/ga_toolbar_getir10GABasketButton")
    public AndroidElement basketBtn;
    @FindBy(className = "android.widget.TextView")
    public List<AndroidElement> menuList;

    @FindBy(xpath = "//*[@text='Dondurma']")
    public AndroidElement categoryDondurma;
    @FindBy(id = "com.getir.casestudy.dev:id/btnAdd")
    public AndroidElement addBtn;
    @FindBy(id = "com.getir.casestudy.dev:id/tvTotalTitle")
    public AndroidElement total;

    public void addItem(int num){
        if(num>=1){
            for (int i = 1; i <num; i++) {
                waitUntil(addBtn).click();
            }
        }
    }


    public void getCategory(String categoryName){
        driver.findElement(By.xpath("//*[@text='"+categoryName+"']")).click();
    }

}
