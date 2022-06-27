package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.categoryPage;;
import util.DriverFactory;

public class categoryPageSteps {

    categoryPage categoryPage = new categoryPage(DriverFactory.getDriver());
    @Then("should see {string} title")
    public void assertTVTitle(String title) {
        categoryPage.check(title);
    }
    @When("click category name {string}")
    public void selectAndClickCategoryName( String buton2) {
        categoryPage.clickCategoryName(buton2);
    }
    @And("click product type {string}")
    public void clickProductType(String bluz) {
        categoryPage.clickProductType(bluz);
    }
    @Then("should see title {string}")
    public void shouldSeeTitle(String title) {
        categoryPage.checkProductTitle(title);
    }
    @When("click {string} button and click {string} button")
    public void clickButtonAndClickButton(String filterBtn, String colorBtn) {
        categoryPage.clickFilterAndColor(filterBtn, colorBtn);
    }
    @And("select color {string}")
    public void selectColor(String color) {
        categoryPage.clickColor(color);
    }
    @And("click list button")
    public void clickUygulaButtonAndListeleButton() {
        categoryPage.clickListButton();
    }
    @And("select product")
    public void selectProduct() {
        categoryPage.selectProduct();
    }
    @And("select size {string}")
    public void selectSize(String size) {
        categoryPage.selectSize(size);
    }
    @And("click add to cart button and go to cart button")
    public void clickAddToBasketButtonAndGoToCart() {
        categoryPage.clickAddToCartButtonAndGoToCart();
    }
    @Then("should see text {string}")
    public void shouldSeeText(String text) {
        categoryPage.checkText(text);
    }
    @When("check product name {string}")
    public void checkProductName(String pName) {
        categoryPage.checkProductName(pName);
    }
    @And("check product size {string}")
    public void checkProductSize(String size) {
        categoryPage.checkProductSize(size);
    }
    @And("check product counter {string}")
    public void checkProductCounter(String count) {
        categoryPage.checkProductCount(count);
    }
    @And("click payment button")
    public void clickPaymentButton() {
        categoryPage.clickPaymentButton();
    }
    @Then("should see delivery text {string}")
    public void shouldSeeDeliveryText(String text) {
        categoryPage.checkDeliveryPage(text);
    }


}
