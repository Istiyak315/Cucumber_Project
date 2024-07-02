package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Herokku\\Login.feature",glue = "definations")


public class run extends AbstractTestNGCucumberTests{
	
	

}
