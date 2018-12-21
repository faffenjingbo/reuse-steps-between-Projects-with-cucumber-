package utils.context;

/**
 * Created by yp-tc-m-2492 on 18/12/20.
 */
public class TestContext {
    public ScenarioContext scenarioContext;

    public TestContext() {
        scenarioContext = new ScenarioContext();
    }

    public ScenarioContext getScenarioContext() {
        return scenarioContext;
    }
}
