package myprojects.automation.assignment2.tests;

import myprojects.automation.assignment2.BaseScript;
import myprojects.automation.assignment2.utils.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CheckMainMenuTest extends BaseScript{

    public static void main(String[] args) throws InterruptedException {

        // WebDriver driver = getDriver();
        System.setProperty("webdriver.gecko.driver","C:\\qatestlab_automation-lecture-2-b54126f80066\\qatestlab_automation-lecture-2-b54126f80066\\src\\main\\resources\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.navigate().to(Properties.getBaseAdminUrl());
        driver.findElement(By.cssSelector("#email")).sendKeys("webinar.test@gmail.com");
        driver.findElement(By.cssSelector("#passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");
        driver.findElement(By.cssSelector(".btn.btn-primary.btn-lg.btn-block.ladda-button")).click();
        Thread.sleep(2000);

        //check Dashboard
        driver.findElement(By.id("tab-AdminDashboard")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().matches("Пульт");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("Пульт");

        //check Orders
        driver.findElement(By.id("subtab-AdminParentOrders")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().matches("Заказы");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("Заказы");
        Thread.sleep(2000);

        //check Catalog
        driver.findElement(By.id("subtab-AdminCatalog")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".title")).getText().matches("товары");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".header-toolbar")).getText().contains("товары");
        Thread.sleep(2000);

        //check Customers
        driver.findElement(By.id("subtab-AdminParentCustomer")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().matches("Управление клиентами");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("Управление клиентами");
        Thread.sleep(2000);

        //check Support
        driver.findElement(By.id("subtab-AdminParentCustomerThreads")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().matches("Customer Service");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("Customer Service");
        Thread.sleep(2000);

        //check Support
        driver.findElement(By.id("subtab-AdminStats")).click();
        driver.findElement(By.cssSelector(".page-title")).getText().matches("Статистика");
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.findElement(By.cssSelector(".page-title")).getText().contains("Статистика");
        Thread.sleep(2000);
        driver.quit();
    }
}