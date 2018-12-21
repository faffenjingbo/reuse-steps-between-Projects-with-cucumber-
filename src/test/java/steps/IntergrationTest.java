package steps;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.util.Map;
import java.util.logging.Logger;

/**
 * Created by yp-tc-m-2492 on 18/12/20.
 */
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/login.feature", plugin = {"pretty", "html:target/cucumber",
        "json:target/cucumber.json"}, monochrome = true)
public class IntergrationTest {
    private static Logger log = Logger.getLogger("IntergrationTest");

    @BeforeClass
    public static void initWireMockServer() {
        log.info("End Init Wire Mock Server ");
    }

    @AfterClass
    public static void stopWireMockServer() {
        log.info("End Stopping Wire Server ");
    }
}
