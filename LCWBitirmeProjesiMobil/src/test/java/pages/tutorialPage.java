package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class tutorialPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Constructor
    public tutorialPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    By text_Tv = By.id("com.lcwaikiki.android:id/textView");
    By text_TvDesc = By.id("com.lcwaikiki.android:id/tvContent");
    By btn_Skip = By.id("com.lcwaikiki.android:id/tvNext");
    By tvTutorial = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"com.lcwaikiki.android:id/vpTutorial\").childSelector(new UiSelector().className(\"android.widget.FrameLayout\").index(1))");

    // Check components
    public void checkTutorialPage() {
        elementHelper.checkElementPresence(text_Tv);
    }
    public void checkTVTutorial() {
        elementHelper.checkElementPresence(tvTutorial);
    }
    public void checkTVText(String text) {
        elementHelper.checkElementWithText(text_Tv, text);
    }
    public void checkTVDescText(String text) {
        elementHelper.checkElementText(text_TvDesc, text);
    }
    public void checkTVButton(String text) {
        elementHelper.checkElementText(btn_Skip, text);
    }
    // Check drag and drop
    public void dragAndDropTVTutorial() {
        elementHelper.dragAndDropElement(600, 600, 0, 600);
    }
    // Click skip button
    public void clickTVSkipButton() {
        elementHelper.click(btn_Skip);
    }
}