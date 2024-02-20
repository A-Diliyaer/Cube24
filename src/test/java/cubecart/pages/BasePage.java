package cubecart.pages;

import cubecart.utils.SessionUtil;
import org.apache.log4j.Logger;

public class BasePage {
    SessionUtil sessionUtil = SessionUtil.getInstance();
    static Logger log = Logger.getLogger(BasePage.class);
}
