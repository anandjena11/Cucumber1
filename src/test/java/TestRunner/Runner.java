package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		      features =".//Features/LoginFeature.feature",
		      glue="StepDefination",
		      dryRun=false,
		      monochrome=true,
		     // plugin= {"pretty","html:target/cucumber-reports/reports1.html1"}
		     // plugin= {"pretty","json:target/cucumber-reports/reports1.json"}
		      plugin= {"pretty","junit:target/cucumber-reports/reports1.xml"}

		
		)
public class Runner {
 // class will be empty 
}
