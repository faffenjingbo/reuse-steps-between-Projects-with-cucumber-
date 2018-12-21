package steps.homeinfo;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.loginfo.LoginStepsDefinitions;
import utils.context.TestContext;
import utils.enums.Context;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * Created by yp-tc-m-2492 on 18/12/20.
 */
public class HomePageSteps {
    private final Logger log = Logger.getLogger("loginSteps");
    TestContext testContext;
    String username = null;

    public HomePageSteps(TestContext context) {
        testContext =context;
        username = (String) testContext.getScenarioContext().getContext(Context.USER_NAME);
    }

    public HomePageSteps() {
    }

//    @When("^login success")
//    public void loginsuccess() throws IOException {
//        log.info("sigin success");
//
//    }

    @Then("^i should be redirected to the home page")
    public void redircttohome() {
        log.info("i have got home page");
    }

    @And("^i should be greeted")
    public void greeted() throws Exception {
        log.info("wellcome to you:" + username);

    }
}
