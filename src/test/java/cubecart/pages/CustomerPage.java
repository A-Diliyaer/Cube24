package cubecart.pages;

import cubecart.utils.XpathUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class CustomerPage extends BasePage  {
    ChromeDriver driver;
    @FindBy(xpath=XpathUtil.customerListLink)
    WebElement customerListLink;
    @FindBy(xpath=XpathUtil.addCustomerButton)
    WebElement addCustomerButton;
    @FindBy(xpath=XpathUtil.searchCustomerButton)
    WebElement searchCustomerButton;

    @FindBy(xpath=XpathUtil.customerGroups)
    WebElement customerGroups;
   // @FindBy(xpath=XpathUtil.customerGroups)
   // WebElement customerGroups;




}
