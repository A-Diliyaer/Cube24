package cubecart.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XpathUtil {

    public static final String usernameField = "//*[@id='username']";
    public static final String passwordField = "//*[@id='password']";
    public static final String loginButton = "//*[@id='login']";
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
    public static final String productsLink= "//*[@id='nav_products']";
    public static final String addProductLink="//*[text()='Add Product']";
    public static final String productNameField="//*[@id='name']";
    public static final String manufacturerField="//*[@id='manufacturer']";
    public static final String conditionField=   "//*[@id='condition']";
    public static final String productCodeField=  "//*[@id='product_code']";
    public static final String productCodeCheckBox="//*[@id='product_code_auto']";
    public static final String productWeightField="//*[@id='product_weight']";
    public static final String dimensionsUnitField=  "//*[@id='dimension_unit']";
    public static final String productWidthField=  "//*[@id='product_width']";
    public static final String productHeightField= "//*[@id='product_height']";
    public static final String productDepthField=   "//*[@id='product_depth']";
    public static final String featureProductsCheckBox="//*[@id='product_featured']";
    public static final String latestProductsCheckBox= "//*[@id='product_latest']";
    public static final String availableForPurchaseCheckBox="//*[@id='available']";
    public static final String listField=                   "//*[@id='live_from']";
    public static final String stockLevelCheckBox=          "//*[@id='use_stock_level']";
    public static final String stockLevelField=  "//*[@id='stock_level']";
    public static final String stockLevelWarningField="//*[@id='stock_warning']";
    public static final String upcCodeField= "//*[@id='upc']";
    public static final String eanCodeField="//*[@id='ean']";
    public static final String janCodeField="//*[@id='jan']";
    public static final String isbnCodeField="//*[@id='isbn']";
    public static final String gtinCodeField="//*[@id='gtin']";
    public static final String mpnCodeField="//*[@id='mpn']";
    public static final String googleCategoryDropDown="//*[@id='google_category_chosen']";
    public static final String saveButton="//*[@value='Save']";
    public static final String successMessage="//*[text()='Product successfully created.']";
    public static final String logOutButton="//*[text()='Log Out ']";

}
