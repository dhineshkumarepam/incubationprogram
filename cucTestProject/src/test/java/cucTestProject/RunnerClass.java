package cucTestProject;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\dhineshkumar_selvam\\git\\incubationprogram\\cucTestProject\\src\\test\\java\\featurefile\\login.feature"},
		glue={""}
		
		)
public class RunnerClass {
	
	

}
