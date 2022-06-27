package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;

public class categoryPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    //Constructor
    public categoryPage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    By tvTitleText = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By menu_Layout =MobileBy.AndroidUIAutomator("new UiSelector().text(\"Giyim\")");
    By menu_Bluz = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Bluz\")");
    By toolbar_Title = By.id("com.lcwaikiki.android:id/toolbarTitle");
    By btn_filter = By.id("com.lcwaikiki.android:id/filter_text");
    By btn_color = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Renk\")");
    By searchFilter = By.id("com.lcwaikiki.android:id/searchFilterEditText");
    By selectedColor = By.id("com.lcwaikiki.android:id/checked_color_text");
    By btn_subFilter = By.id("com.lcwaikiki.android:id/subFilterButton");
    By btn_List = By.id("com.lcwaikiki.android:id/buttonFilter");
    By products = By.id("com.lcwaikiki.android:id/recyclerProduct");
    By btn_Size = MobileBy.AndroidUIAutomator("new UiSelector().text(\"M\")");
    By btn_AddBasket = By.id("com.lcwaikiki.android:id/basket");
    By txt_OrderSummary = By.id("com.lcwaikiki.android:id/orderSummaryText");
    By goCart = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Sepete Git\")");
    By txt_ProductName = By.id("com.lcwaikiki.android:id/productTitleText");
    By selectedSize =By.id("com.lcwaikiki.android:id/itemBasketSizeText");
    By counter =By.id("com.lcwaikiki.android:id/toolbarTitle");
    By btn_Payment = By.id("com.lcwaikiki.android:id/tv_go_checkout");
    By text_PaymentPage = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Teslimat Türü\")");

   public void check(String text){
       elementHelper.checkElementText(tvTitleText, text);
   }
    public void clickCategoryName(String btn){
        elementHelper.clickElementWithText(menu_Layout, btn);
    }
    public void clickProductType(String btnProductType){
        elementHelper.clickElementWithText(menu_Bluz,btnProductType);
    }
    public void checkProductTitle(String title){
        elementHelper.checkElementText(toolbar_Title, title);
    }
    public void clickFilterAndColor(String filterBtn, String colorBtn){
        elementHelper.clickElementWithText(btn_filter,filterBtn);
        elementHelper.clickElementWithText(btn_color, colorBtn);
    }
    public void clickColor(String color){
        elementHelper.sendKey(searchFilter, color);
        elementHelper.click(selectedColor);
        elementHelper.click(btn_subFilter);
    }
    public void clickListButton(){
        elementHelper.click(btn_List);
    }
    public void selectProduct(){
        elementHelper.clickElementFromList(products);
    }
    public void selectSize(String size){
       elementHelper.click(btn_AddBasket);
       elementHelper.clickElementWithText(btn_Size, size);
    }
    public void clickAddToCartButtonAndGoToCart(){
        elementHelper.click(btn_AddBasket);
        elementHelper.click(goCart);
    }
    public void checkText(String text){
        elementHelper.checkElementText(txt_OrderSummary, text);
    }
    public void checkProductName(String name){
       elementHelper.checkElementWithText(txt_ProductName,name);
    }
    public void checkProductSize(String size){
        elementHelper.checkElementWithText(selectedSize,size);
    }
    public void checkProductCount(String count){
        elementHelper.checkElementWithText(counter,count);
    }
    public void clickPaymentButton(){
       elementHelper.click(btn_Payment);
    }
    public void checkDeliveryPage(String text){
       elementHelper.checkElementWithText(text_PaymentPage,text);
    }

}
