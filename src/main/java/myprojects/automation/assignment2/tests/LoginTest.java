package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseScript {

    @Test
    public static void main(String[] args) throws InterruptedException {

//        WebDriver driver = getDriver();
        System.setProperty("webdriver.gecko.driver","C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(Properties.getBaseAdminUrl());
        driver.findElement(By.cssSelector("#email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.ladda-button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("employee_infos")).click();
        driver.findElement(By.id("header_logout")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
