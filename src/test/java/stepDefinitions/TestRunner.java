package stepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/HtmlReports/report.html"})
public class TestRunner {
}
