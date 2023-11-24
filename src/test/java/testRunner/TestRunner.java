package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)

@CucumberOptions(features ="classpath:features",glue = "cucumber_step")
public class TestRunner extends AbstractTestNGCucumberTests {

}
//,stepDefination
//src\\test\\resources\\features\\login.feature"classpath:features"

