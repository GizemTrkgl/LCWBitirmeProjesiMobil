package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import util.DriverFactory;

public class homePageSteps {

    homePage homePage = new homePage(DriverFactory.getDriver());

    @When("click {string}")
    public void click(String profil) {
        homePage.clickProfil(profil);
    }
    @Then("should see {string} home page")
    public void welcomeButton(String welcomeText) {
        homePage.checkWelcomeText(welcomeText);
    }
    @When("click categories {string}")
    public void clickCategories(String cat) {
        homePage.clickCategories(cat);
    }

}
