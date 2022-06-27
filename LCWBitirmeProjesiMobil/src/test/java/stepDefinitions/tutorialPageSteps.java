package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tutorialPage;
import util.DriverFactory;

public class tutorialPageSteps {

    tutorialPage tutorialPage = new tutorialPage(DriverFactory.getDriver());

    @Given("user is opened LcWaikiki App")
    public void assertTutorialPage() {
        tutorialPage.checkTutorialPage();
    }
    @Then("should see TvTutorial")
    public void assertTVTutorial() {
        tutorialPage.checkTVTutorial();
    }
    @Then("should see {string} text")
    public void assertTVText(String text) {
        tutorialPage.checkTVText(text);
    }

    @Then("should see {string} title description")
    public void assertTVDesc(String desc) {
        tutorialPage.checkTVDescText(desc);
    }
    @Then("should see {string} button")
    public void assertButton(String button) {
        tutorialPage.checkTVButton(button);
    }
    // DragDrop
    @When("drag and drop TvTutorial")
    public void dragAndDropTVTutorial() {
        tutorialPage.dragAndDropTVTutorial();
    }
    // Skip Button
    @When("click Skip button")
    public void skipButton() {
        tutorialPage.clickTVSkipButton();
    }


}
