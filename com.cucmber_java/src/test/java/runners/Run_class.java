package runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "G:\\Photon_Automation\\com.cucmber_java\\Alldocfiles\\dad.feature" }, 
glue = {"testcases"}, plugin = { "html:target/cucmber-html-report", "json:target/cucumber.json" }

)
public class Run_class {

}