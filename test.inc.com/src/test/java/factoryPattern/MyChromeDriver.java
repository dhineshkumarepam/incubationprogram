package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import factoryPattern.FactoryPatternHt.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;


	class MyChromeDriver implements WebDriverFactory {
	    @Override
	    public WebDriver createWebDriver() {
	        WebDriverManager.chromedriver().setup();
	        WebDriver driver = new ChromeDriver();
	      
	    	System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
	        return new ChromeDriver();
	        
	    }
	}

