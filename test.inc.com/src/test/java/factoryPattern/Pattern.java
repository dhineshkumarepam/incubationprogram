package factoryPattern;

import org.openqa.selenium.WebDriver;

import factoryPattern.FactoryPatternHt.BrowserType;

public class Pattern {
	static WebDriver driver;
	public static void main(String[] args) {
		System.out.println("hai");
		 driver = BrowserFactory.getWebDriver(BrowserType.CHROME);
			driver.get("https://example.com");

			driver.quit();
		
	}

}
