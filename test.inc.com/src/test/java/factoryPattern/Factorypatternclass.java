package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import factoryPattern.FactoryPatternHt.BrowserType;

public class Factorypatternclass {
	static WebDriver driver;
	@Test
 public void runner(){
	 driver = BrowserFactory.getWebDriver(BrowserType.CHROME);
		driver.get("https://example.com");

		driver.quit();
 }
	@Test
	public void google() {

	}
	
}
