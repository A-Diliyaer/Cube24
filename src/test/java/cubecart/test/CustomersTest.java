package cubecart.test;

import cubecart.utils.DbUtilMysql;
import org.testng.annotations.Test;

public class CustomersTest extends BaseTest {

    @Test
    public void myTestCase() {

        System.out.println("hello world");
        DbUtilMysql.getProductInfo("Calvin Klein");
    }
}
