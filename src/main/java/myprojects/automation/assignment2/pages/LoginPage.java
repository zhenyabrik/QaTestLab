package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;



/**
 * Created by PC on 26.09.2017.
 */
public class LoginPage {

    private static By emailInput = By.cssSelector("#email");
    private static By passwordInput = By.cssSelector("#passwd");
    private static By loginButton = By.cssSelector(".btn.btn-primary.btn-lg.btn-block.ladda-button");

    public static By getEmailInput() {
        return emailInput;
    }

    public static By getPasswordInput() {
        return passwordInput;
    }

    public static By getLoginButton() {
        return loginButton;
    }
}
