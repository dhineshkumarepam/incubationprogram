package cucTestProject;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\featurefile\\login.feature"},
		glue={"stepDef.CucClass"}
		
		)
public class RunnerClass {
	
	

}
