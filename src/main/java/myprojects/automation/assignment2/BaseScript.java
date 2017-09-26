package myprojects.automation.assignment2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

/**
 * Base script functionality, can be used for all Selenium scripts.
 */
public abstract class BaseScript {

    /**
     *
     * @return New instance of {@link WebDriver} object.
     */
//    public static WebDriver getDriver() {
//        // TODO return  WebDriver instance
////        WebDriver driver =new FirefoxDriver();
////        String driverPath = System.getProperty("driver.executable");
//////        if (driverPath == null)
//////            throw new SkipException("Path...");
////        System.setProperty("webdriver.gecko.driver","C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
////        return new FirefoxDriver();
//////        throw new UnsupportedOperationException("Method doesn't return WebDriver instance");
//
//
////        WebDriver driver = getDriver();
//
//        System.setProperty("webdriver.gecko.driver","C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
//        WebDriver driver =new FirefoxDriver();
//        driver.manage().window().maximize();
//        return driver;
//    }

    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

//    @BeforeClass
//    public void startBrowser() {
//
//        System.setProperty("webdriver.gecko.driver","C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
//        driver = new FirefoxDriver();
//        driver.manage().window().maximize();
//    }
//
//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
