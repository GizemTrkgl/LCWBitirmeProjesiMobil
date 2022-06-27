package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.profilPage;
import util.DriverFactory;

public class profilPageSteps {
    profilPage profilPage = new profilPage(DriverFactory.getDriver());

    //Login steps
    @And("enter e-mail {string}")
    public void enterEMail(String email) {
        profilPage.enterEmail(email);
    }
    @And("enter password {string}")
    public void enterPassword(String password) {
        profilPage.enterPassword(password);
    }
    @And("click on login button")
    public void clickOnLoginButton() {
        profilPage.clickLoginButton();
    }
    @Then("should see home page {string}")
    public void shouldSeeHomePage(String text) {
        profilPage.checkHomePage(text);
    }
    //Register steps
    @When("click {string} button")
    public void clickButton(String registerButton) {
        profilPage.clickRegButton(registerButton);
    }
    @Then("should see register page")
    public void shouldSeeRegisterPage() {
        profilPage.checkRegPage();
    }
    @And("enter phone number {string}")
    public void enterPhoneNumber(String number) {
        profilPage.enterPhone(number);
    }
    @And("click agreement checkbox")
    public void clickAgreementCheckbox() {
        profilPage.clickAgreement();
    }
    @And("click button2 {string}")
    public void clickButtonReg(String regButon) {
        profilPage.clickRegButton2(regButon);
    }
    @Then("Then should see phone code box")
    public void thenShouldSeePhoneCodeBox() {
        profilPage.checkPhoneBox();
    }
}
