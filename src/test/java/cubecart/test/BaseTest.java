package cubecart.test;

import cubecart.utils.SessionUtil;
import org.apache.log4j.Logger;

public class BaseTest {
    SessionUtil sessionUtil = SessionUtil.getInstance();
    static Logger log = Logger.getLogger(BaseTest.class);
}
