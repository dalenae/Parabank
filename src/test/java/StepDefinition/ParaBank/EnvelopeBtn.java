package StepDefinition.ParaBank;

import Pages.ParaBankLandingPage;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class EnvelopeBtn {
    ParaBankLandingPage ParaLPage = new ParaBankLandingPage();
    @Then("^I verify envelope button is enabled$")
    public void envelopeIsEnabled() {
        Assert.assertTrue(ParaLPage.isEnvelopeBtnEnabled()); }


}
