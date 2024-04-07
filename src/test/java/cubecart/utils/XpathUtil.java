package cubecart.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class XpathUtil {

    public static final String usernameField = "//*[@id='username']";
    public static final String passwordField = "//*[@id='password']";
    public static final String loginButton = "//*[@id='login']";


//*************************************************************About Reviews***************************************************************************
    //Reviews
    public static final String reviews_menu = "//*[@id='menu_Inventory']//li//a[@href='?_g=products&node=reviews']";
    public static final String product_Reviews = "//div[@id='tab_reviews']//a['Product Reviews']";
    public static final String add_Review = "//*[@id='tab_control']//div[@id='tab_reviews']//a";
    public static final String bulk_Delete = "//*[@id='tab_control']//div[@id='tab_bulk_delete']//a";
    public static final String search = "//*[@id='tab_control']//div[@id='tab_search']//a";
    //Add review
    public static final String product_Field = "//*[@id='review']//div//span//input[@id='ajax_name']";
    public static final String status_Checkbox = "//*[@id='review']//div//span/img";
    public static final String name_Field = "//*[@id='review']//input[@id='ajax_name']";
    public static final String email_Field = "//*[@id='review']//fieldset//div//span//input[@id='review_email']";
    public static final String title_Field = "//*[@id='review']//fieldset//div//span//input[@id='review_title']";
    public static final String content_Field = "//*[@id='review']//fieldset//div//span//textarea[@id='review_content']";
    public static final String rating_Stars = "//*[@id='review']//fieldset//div//span//input[@value='3']";
    public static final String add_Review_Submit_Button = "//*[@class='form_control']//input[@type='submit']";
    //Bulk Delete
    public static final String bdEmail_Field = "//*[@id='bulk_delete']//span//input[@id='email']";
    public static final String bdIpAddress_Field = "//*[@id='bulk_delete']//div//span//input[@id='ip_address']";
    public static final String bdSubmit_Button = "//*[@class='form_control']//input[@class='submit']";
    //Search Reviews
    public static final String keywords_Field = "//div[@id='search']//fieldset//span//input[@id='search-keywords']";
    public static final String filter_By_Product_Field = "//div[@id='search']//fieldset//span//input[@name='filter[product_string]']";
    public static final String status_Dropbox_All = "//div[@id='search']//fieldset//span//select[@name='filter[approved]']//option[1]";
    public static final String status_Dropbox_Approved ="//div[@id='search']//fieldset//span//select[@name='filter[approved]']//option[@value='1']";
    public static final String status_Dropbox_Unapproved ="//div[@id='search']//fieldset//span//select[@name='filter[approved]']//option[@value='0']";
    public static final String search_Submit_Button ="//div[@id='page_content']//div[@class='form_control']//input[@type='submit']";

//*************************************************************About Reviews***************************************************************************

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
