package cubecart.test;

import cubecart.utils.SessionUtil;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BaseTest {

    ChromeDriver driver;


    public void setUp(){
        System.out.println("Setting up resources for the test...");
    }


    public  void openBrowser() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://cubecartuat.unitedcoderapp.com/admin_d9nchr.php");
    }



    public  void login(String userName, String password) {
        WebElement userNameField = driver.findElement(By.id("username"));
        userNameField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
    }

    public  void logOut() {
        WebElement logOutLink = driver.findElement(By.linkText("Log Out"));
        logOutLink.click();
    }

    public  void closeBrowser() {
        System.out.println("Tearing down resources after the test...");
        driver.close();
        driver.quit();
    }




}



