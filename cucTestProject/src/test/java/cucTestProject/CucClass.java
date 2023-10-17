package cucTestProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CucClass extends BaseClass {
	
	
	@Given("User navigates to Login page")
	public void user_navigates_to_login_page() {
		driver.get("https://www.facebook.com/");
	}

	@When("User enters valid email address {string}")
	public void user_enters_valid_email_address(String string) {
		WebElement findElement = driver.findElement(By.xpath("//input[@type='text']"));
		findElement.sendKeys(string);
	    throw new io.cucumber.java.PendingException();
	}

	@When("Enter valid Password  {string}")
	public void enter_valid_password(String string) {
		WebElement findElement = driver.findElement(By.xpath("//input[@type='password']"));
		findElement.sendKeys(string);
	    throw new io.cucumber.java.PendingException();
	}

	@When("Clicks on login button")
	public void clicks_on_login_button() {
		WebElement findElement = driver.findElement(By.xpath("//button[@name='login']"));
		findElement.clear();
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User should login successfully")
	public void user_should_login_successfully() {
		
	    throw new io.cucumber.java.PendingException();
	}

}
