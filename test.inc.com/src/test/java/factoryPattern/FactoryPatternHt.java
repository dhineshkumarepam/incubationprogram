package factoryPattern;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.ie.InternetExplorerDriver;
	public class FactoryPatternHt {

	interface WebDriverFactory {
	    WebDriver createWebDriver();
	}

	enum BrowserType {
	    CHROME,
	    FIREFOX,
	    IE
	}

	
}
