//package loginfo;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import java.io.IOException;
//import java.util.logging.Logger;
//
///**
// * Created by yp-tc-m-2492 on 18/12/20.
// */
//public class LoginStepsDefinitions {
//    private final Logger log = Logger.getLogger("loginSteps");
//
//    @Given("^I'm authentified with user (.*) and password (.*) on the url (.*)$")
//    public void authenticateUser(String username, String pasword, String authUrl) throws Exception {
//        log.info("input username and password");
//    }
//
//    @When("^I ask for the current user calling \"([^\"]*)\"$")
//    public void requestCurrentUser(final String currentUserApiUrl) throws IOException {
//        log.info("current user calling page success");
//
//    }
//
//    @Then("^I get (\\w+) response$")
//    public void checkLastResponseSatus(String responseSatus) {
//            log.info("i have got right response");
//    }
//
//    @Then("^the user detail must contains:$")
//    public void checkUserDetail(DataTable userDetail) throws Exception {
//        log.info("check user's info");
//
//    }
//}
