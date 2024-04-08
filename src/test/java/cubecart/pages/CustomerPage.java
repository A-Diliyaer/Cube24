package cubecart.pages;

import cubecart.utils.Driver;
import cubecart.utils.UiUtil;
import cubecart.utils.XpathUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CustomerPage extends BasePage  {
Driver driver;
public void addCustomerMethod() {
    UiUtil.ClickElement(XpathUtil.customerListLink);
    UiUtil.ClickElement(XpathUtil.addCustomerButton);
    UiUtil.ClickElement(XpathUtil.addCustomerstatus);
    UiUtil.getElement(XpathUtil.firstName).sendKeys(generateFakeFirstName());
    UiUtil.getElement(XpathUtil.lastName).sendKeys(generateFakeLasttName());
    UiUtil.getElement(XpathUtil.email).sendKeys(generateEmail());
    UiUtil.getElement(XpathUtil.newPassword).sendKeys("united1234");
    UiUtil.getElement(XpathUtil.confirmPassword).sendKeys("united1234");
    UiUtil.ClickElement(XpathUtil.saveButton);
}
public boolean verifyCustomerAdded(){
    if (UiUtil.getElement(XpathUtil.customerSuccessfullyAdded).isDisplayed())
        return true;
    else
        return false;
}
}
