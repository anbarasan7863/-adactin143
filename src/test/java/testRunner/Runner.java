package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\adactin\\feature",
glue = {"stepdefination","Hooks"},
dryRun = false,
plugin = {"html:target\\report\\Adactin.html","json:taget\\report\\adactin_j.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
publish = true)
public class Runner {

}
