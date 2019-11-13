package pages;

import base.CommonAPI;
import report.TestLogger;

public class Return extends CommonAPI {
    public void clickOnReturnbutton() {
        clickOnElementByXpath("//span[contains(text(),'Returns &')]");
        TestLogger.log("Return button clicked");
    }
}
