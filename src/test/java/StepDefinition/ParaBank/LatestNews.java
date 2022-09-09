package StepDefinition.ParaBank;

import Helper.Misc;
import Pages.ParaBankLandingPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LatestNews {
    ParaBankLandingPage ParaLPage = new ParaBankLandingPage();

    @When("^I click latest news link$")
    public void clickLatestNews() {
        ParaLPage.clickLatestNewsLink();
        Misc.pause(2); }

    @Then("^I verify News title is displayed$")
    public void newsTitleIsDisplayed() {
        Assert.assertTrue(ParaLPage.isNewsTitleDisplayed());
        Misc.pause(2); }





}
