package factoryPattern;

import org.openqa.selenium.WebDriver;

import factoryPattern.FactoryPatternHt.BrowserType;

class BrowserFactory {
    public static WebDriver getWebDriver(BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return new MyChromeDriver().createWebDriver();
            case FIREFOX:
                return new MyFirefoxDriver().createWebDriver();
            case IE:
                return new MyIEDriver().createWebDriver();
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}
