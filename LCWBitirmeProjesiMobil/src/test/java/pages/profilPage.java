package pages;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

public class profilPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Constructor
    public profilPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    By btn_RegisterNow = By.id("com.lcwaikiki.android:id/registerNow");
    By headerRegister = By.id("com.lcwaikiki.android:id/headerLogin");
    By email = By.id("com.lcwaikiki.android:id/edtEmail");
    By password = By.id("com.lcwaikiki.android:id/edtPassword");
    By phoneNumber = By.id("com.lcwaikiki.android:id/edtPhoneNumber");
    By chckbox_agreement = By.id("com.lcwaikiki.android:id/contractChecked");
    By btn_Register = By.id("com.lcwaikiki.android:id/buttonRegister");
    By activationCode = By.id("com.lcwaikiki.android:id/activationCode");
    By btn_Login = By.id("com.lcwaikiki.android:id/buttonLogin");
    By txt_welcome = By.id("com.lcwaikiki.android:id/txtWelcomeHeader");

    //Login processes
    public void enterEmail(String mail){
        elementHelper.sendKey(email,mail);
    }
    public void enterPassword(String pass){
        elementHelper.sendKey(password, pass);
    }
    public void clickLoginButton(){
        elementHelper.click(btn_Login);
    }
    public void checkHomePage(String text){
        elementHelper.checkElementWithText(txt_welcome,text);
    }
    //Registration processes
    public void clickRegButton(String button){
        elementHelper.checkElementText(btn_RegisterNow, button);
    }
    public void checkRegPage(){
        elementHelper.checkElementVisible(headerRegister);
    }
    public void enterPhone(String number){
        elementHelper.sendKey(phoneNumber,number);
    }
    public void clickAgreement(){
        elementHelper.click(chckbox_agreement);
    }
    public void clickRegButton2(String regButton){
        elementHelper.clickElementWithText(btn_Register, regButton);
    }
    public void checkPhoneBox(){
        elementHelper.checkElementVisible(activationCode);
    }
}
