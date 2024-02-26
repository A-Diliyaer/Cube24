package cubecart.test;
// login("testautomation1","automationadmin!123");

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class TestClass extends BaseTest {

    @BeforeClass
    public void open(){
        setUp();
    }
    @Test
    public void testLogin() {
        openBrowser();
        login("testautomation1", "automationadmin!123");

    }
    @AfterClass
    public void tearDown(){
        logOut();
        closeBrowser();
    }

}

