import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import steps.homeinfo.HomePageSteps;
import steps.loginfo.LoginStepsDefinitions;
import utils.context.TestContext;

import java.util.logging.Logger;

/**
 * Created by yp-tc-m-2492 on 18/12/20.
 */
@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps.loginfo","steps.homeinfo"} ,features = "src/test/resources/features/homepage1.feature", plugin = {"pretty", "html:target/cucumber",
        "json:target/cucumber.json"}, monochrome = true)
public class IntergrationTesthome {
}
