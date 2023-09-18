package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features= "src/test/java/features",
        glue = {"/MakeMytrip_cucumber/src/test/java/stepDefinitions","/MakeMytrip_cucumber/src/test/java/utilities"},
        plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"}

)



public class TestRun {

}
