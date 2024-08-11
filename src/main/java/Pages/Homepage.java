package Pages;

import org.openqa.selenium.By;
import utility.BrowserDriver;

public class Homepage extends BrowserDriver {

    public static String hamburger_menu = "//input[@type='checkbox'] ";
    public static String signin = "//li[text()='Sign In Portal']";

    public static String enter_user = "//input[@id='usr']";

    public static String enter_pass = "//input[@id='pwd']";

    public static String click_login = "//input[@type='submit']";


    static void click_hamburger() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(hamburger_menu)).click();
    }

    static void click_signin() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(signin)).click();
    }

    static void enter_username() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_user)).sendKeys("abhi@gmail.com");

    }

    static void enter_pass() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(enter_pass)).sendKeys("abhi@gmail.com");
    }

    static void click_login() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath(click_login)).click();
    }





}
