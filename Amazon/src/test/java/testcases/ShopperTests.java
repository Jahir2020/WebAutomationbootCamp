package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.HomePagePOM;

public class ShopperTests extends CommonAPI {

    @Test
    public void testShopperToolkit() {
        HomePagePOM homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
        homePagePOM.validateShopperDisplayed();
        homePagePOM.validateShopperClickAble();
    }

}