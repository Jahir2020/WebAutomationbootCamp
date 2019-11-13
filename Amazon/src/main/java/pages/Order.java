package pages;

import base.CommonAPI;
import report.TestLogger;

public class Order extends CommonAPI {
    public void clickOnOrderbutton() {
        clickOnElementByXpath("//span[@class='nav-line-2'][contains(text(),'Orders')]");
        TestLogger.log("Order button clicked");
    }
}

