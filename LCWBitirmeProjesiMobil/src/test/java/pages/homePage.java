package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class homePage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Constructor
    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    By btn_Profil = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Profil\")");
    By btn_Category = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Kategoriler\")");
    By welcomeText = By.id("com.lcwaikiki.android:id/txtWelcomeHeader");

    public void clickProfil(String profil){
        elementHelper.clickElementWithText(btn_Profil, profil);
    }
    public void checkWelcomeText(String text) {
        elementHelper.checkElementWithText(welcomeText, text);
    }
    public void clickCategories(String cat){
        elementHelper.clickElementWithText(btn_Category, cat);
    }


}
