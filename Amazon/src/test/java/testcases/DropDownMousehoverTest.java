package testcases;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownMousehoverTest extends CommonAPI {
    @Test
    public void testDropDown() {
        WebElement element = getElement("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]");
        Select select = new Select(element);
        select.selectByIndex(4);
    }

    @Test
    public void testMouseHover() {
        WebElement element = getElementByLinkText("Blog");
        Actions actions = new Actions(driver);
        actions.moveToElement(element).build().perform();
        clickOnElementByLinkText("Carrers");
    }

    @Test
    public void scrollToView() {
        WebElement element = getElementByLinkText("Help");
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    @Test
    public void testScrolling() {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(0,1000)");

    }
}
