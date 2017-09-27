package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
    public static WebDriver getDriver() {
        // TODO return  WebDriver instance
        System.setProperty("webdriver.gecko.driver", "C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
        return new FirefoxDriver();
    }
}