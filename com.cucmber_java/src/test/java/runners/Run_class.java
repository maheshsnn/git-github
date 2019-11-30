package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "G:\\Photon_Automation\\com.cucmber_java\\Alldocfiles\\my.feature" }, 
glue = {"testcases"}, plugin = { "html:target/cucmbers-html-report", "json:target/cucumber.json" },
dryRun = false,
monochrome = true)

public class Run_class {

}
