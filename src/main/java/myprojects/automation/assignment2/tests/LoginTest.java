package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends BaseScript {

    @Test
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = getDriver();
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
