package factoryPattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import factoryPattern.FactoryPatternHt.WebDriverFactory;

class MyIEDriver implements WebDriverFactory {
    @Override
    public WebDriver createWebDriver() {
        System.setProperty("webdriver.ie.driver", "path/to/IEDriverServer.exe");
        return new InternetExplorerDriver();
    }
}
