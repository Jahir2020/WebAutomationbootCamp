package pages;

import base.CommonAPI;
import org.openqa.selenium.By;

public class SearchProduct extends CommonAPI {
    public void searchvalue() {
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "best laptops in 2019");
        driver.findElement(By.className("nav-input")).click();
        sleepFor(3);
        clickOnElementByXpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=0']//img[@class='s-image']");
        clickOnElementByXpath("//input[@id='add-to-cart-button']");
        sleepFor(3);
    }
}
