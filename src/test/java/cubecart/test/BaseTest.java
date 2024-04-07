package cubecart.test;

import cubecart.utils.*;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class BaseTest {
    SessionUtil sessionUtil = SessionUtil.getInstance();
    static Logger log = Logger.getLogger(BaseTest.class);

    @BeforeClass
    public void connectToDB() {
        DbUtilMysql.connectToDB();
    }

    @BeforeMethod
    public void setUp() {
        log.info("Starting Test Automation");
        log.info("Browser type ::"+ ConfigReader.getProperty("browser"));
        String URL=ConfigReader.getProperty("url");
        log.info("Environment ::"+URL);
        Driver.getDriver().get(URL);
        log.info("Starting browser");
        UiUtil.getElement(XpathUtil.usernameField).sendKeys(ConfigReader.getProperty("username"));
        UiUtil.getElement(XpathUtil.passwordField).sendKeys(ConfigReader.getProperty("password"));
        UiUtil.ClickElement(XpathUtil.loginButton);
        log.info("logging into app");
    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
        log.info("browser closed");
    }

    @AfterClass
    public void closeDBConnection(){
        DbUtilMysql.closeDBConnection();
    }
}
