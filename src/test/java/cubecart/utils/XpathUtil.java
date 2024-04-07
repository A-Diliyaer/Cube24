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
}
