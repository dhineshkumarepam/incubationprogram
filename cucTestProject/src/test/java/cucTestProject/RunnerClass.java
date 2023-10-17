package cucTestProject;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src\\test\\java\\login.feature"},
		glue={"cucTestProject.CucClass"}
		
		)
public class RunnerClass {
	
	

}
