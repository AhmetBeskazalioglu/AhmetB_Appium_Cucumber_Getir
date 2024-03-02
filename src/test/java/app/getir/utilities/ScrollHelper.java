package app.getir.utilities;


import app.getir.step_definitions.Initialize;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;

public class ScrollHelper {

    private AppiumDriver driver = Initialize.driver;

    public void scrollVerticalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollTextIntoView(\""+text+"\")"));

    }
    public void scrollHorizontalHelper(String text){
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".setAsHorizontalList().scrollTextIntoView(\""+text+"\")"));
    }
}
