package cubecart.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XpathUtil {

    public static final String usernameField = "//*[@id='username']";
    public static final String passwordField = "//*[@id='password']";
    public static final String loginButton = "//*[@id='login']";
    //for customer page
    public static final String customerListLink= "//*[text()='Customer List']";
    public static final String addCustomerButton= "//*[text()='Add Customer']";
    public static final String searchCustomerButton= "//a[text()='Search Customers']";
    public static final String customerGroups= "//a[text()='Customer Groups']";
    public static final String GDPRTools= "//a[text()='GDPR Tools']";
    public static final String addCustomerstatus= "//img[@class='checkbox cbs']";
    public static final String title= "//*[@id='cust-title']";
    public static final String firstName= "//*[@id='cust-firstname']";
    public static final String lastName= "//*[@id='cust-lastname']";
    public static final String typeDropDown= "//*[@id='cust-type']";
    public static final String languageDropDown= "//*[@id='language']";
    public static final String notes= "//*[@id='cust-notes']";
    public static final String email= "//*[@id='cust-email']";
    public static final String cellPhone= "//*[@id='cust-mobile']";
    public static final String subscribeDropDown= "//*[@id='subscription_status']";
    public static final String newPassword= "//*[@id='cust-password']";
    public static final String confirmPassword= "//*[@id='cust-passconf']";
    public static final String saveButton= "//*[@name='save']";
    public static final String customerSuccessfullyAdded= "//*[@class='success']";




}
