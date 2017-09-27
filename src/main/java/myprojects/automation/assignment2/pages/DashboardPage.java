package myprojects.automation.assignment2.pages;

import org.openqa.selenium.By;

/**
 * Created by PC on 27.09.2017.
 */
public class DashboardPage {

    private static By userAvatar = By.id("employee_infos");
    private static By logoutButton = By.id("header_logout");

    public static By getUserAvatar() {
        return userAvatar;
    }

    public static By getLogoutButton() {
        return logoutButton;
    }
}
