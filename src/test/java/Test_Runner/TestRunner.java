package Test_Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/Features",
        glue = {"Step_Definitions", "utility"},
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
)
public class TestRunner {
    // No additional code needed here
}
