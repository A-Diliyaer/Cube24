package cubecart.test;

import cubecart.utils.ConfigReader;
import cubecart.utils.Driver;
import cubecart.utils.SessionUtil;
import cubecart.utils.UiUtil;
import org.apache.log4j.Logger;
import org.testng.annotations.*;

public class BaseTest {
    SessionUtil sessionUtil = SessionUtil.getInstance();
    static Logger log = Logger.getLogger(BaseTest.class);

    @BeforeMethod
    public void setUp() {
        log.info("Starting Test Automation");
        log.info("Browser type ::"+ ConfigReader.getProperty("browser"));
        String URL=ConfigReader.getProperty("url");
        log.info("Environment ::"+URL);
        Driver.getDriver().get(URL);
        log.info("Starting browser");
        UiUtil.getElement("//*[@id='username']").sendKeys(ConfigReader.getProperty("username"));
        UiUtil.getElement("//*[@id='password']").sendKeys(ConfigReader.getProperty("password"));
        UiUtil.ClickElement("//*[@id='login']");
        log.info("logging into app");
    }


    @AfterMethod
    public void tearDown(){
        Driver.closeDriver();
        log.info("browser closed");
    }





}
