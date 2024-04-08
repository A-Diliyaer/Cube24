package cubecart.pages;

import cubecart.utils.Driver;
import cubecart.utils.SessionUtil;
import net.datafaker.Faker;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    SessionUtil sessionUtil = SessionUtil.getInstance();
    static Logger log = Logger.getLogger(BasePage.class);
WebDriver webDriver;
    Faker faker;

    public BasePage() {
        faker = new Faker();
    }
    public String generateFakeFirstName(){
        String firstName=faker.name().firstName();
        return firstName;
    }
    public String generateFakeLasttName(){
        String lastName=faker.name().firstName();
        return lastName;
    }
    public String generateEmail(){
        String email=faker.internet().emailAddress();
        return email;
    }
//    public void sleep(int seconds){
//        try {
//            Thread.sleep(seconds*2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//    }
//    public void waitForElementPresent(WebElement element){
//        WebDriverWait wait=new WebDriverWait(webDriver, Duration.ofSeconds(3));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}

