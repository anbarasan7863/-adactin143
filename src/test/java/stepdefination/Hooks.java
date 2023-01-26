package stepdefination;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.adactin.Baseclass.Baseclass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Baseclass {
	@Before
	public void beforeHooks() {
System.out.println("AM bebore Hooks");
	}
	@After
	public void afterHooks(Scenario scenario) {
		if(scenario.isFailed()) {
	TakesScreenshot ts=(TakesScreenshot)driver	;
	byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
	scenario.attach(screenshotAs, "img.png", "screenshot");
	}
		driver.quit();
	}
}
