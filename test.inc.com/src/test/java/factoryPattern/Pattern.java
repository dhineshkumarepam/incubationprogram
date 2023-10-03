package factoryPattern;

import org.openqa.selenium.WebDriver;

import factoryPattern.FactoryPatternHt.BrowserType;

public class Pattern {
	static WebDriver driver;
	public static void main(String[] args) {
		
		 driver = BrowserFactory.getWebDriver(BrowserType.CHROME);
			driver.get("https://www.google.com/");

			driver.quit();
		
	}

}
