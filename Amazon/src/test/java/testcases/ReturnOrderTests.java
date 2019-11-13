package testcases;

import base.CommonAPI;
import org.testng.annotations.Test;
import report.TestLogger;

public class ReturnOrderTests extends CommonAPI {
  @Test
    public void clickOnReturnbutton() {
        clickOnElementByXpath("//span[contains(text(),'Returns &')]");
        TestLogger.log("Return button clicked");
    }

@Test
    public void clickOnOrderbutton() {
        clickOnElementByXpath("//span[@class='nav-line-2'][contains(text(),'Orders')]");
        TestLogger.log("Order button clicked");
    }
}
