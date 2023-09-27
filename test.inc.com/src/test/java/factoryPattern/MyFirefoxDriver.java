package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import factoryPattern.FactoryPatternHt.WebDriverFactory;

class MyFirefoxDriver implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.gecko.driver", "path/to/geckodriver.exe");
        return new FirefoxDriver();
    }
}
