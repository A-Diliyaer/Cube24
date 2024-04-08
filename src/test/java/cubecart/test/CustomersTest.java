package cubecart.test;

import cubecart.pages.CustomerPage;
import cubecart.utils.DbUtilMysql;
import org.testng.annotations.Test;

public class CustomersTest extends BaseTest {

    @Test

    public void addCustomerTest() {
        CustomerPage customerPage=new CustomerPage();
        customerPage.addCustomerMethod();
        customerPage.verifyCustomerAdded();

    }
}
