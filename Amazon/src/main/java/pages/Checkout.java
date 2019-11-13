package pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class Checkout extends CommonAPI {

  @FindBy(linkText="shopper Toolkit")
    WebElement validshopper;

  @FindBy(xpath ="//h2[contains(text(),'Get more value out of shopping')]")
   WebElement shopperclickable;


  public void validShopperClickable(){
      Assert.assertEquals(shopperclickable.isDisplayed(),true);
  }

    public void validateshopperDisplayed(){
        Assert.assertEquals(validshopper.isDisplayed(),true);
    }


    public void validateProduct(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "//span[contains(text(),'AccountingBook')]");
    }
    public void validateshoppingCart(){
        clickOnElementByXpath("//span[@class='nav-cart-icon nav-sprite']");
    }
    public void validateCheckout(){
        clickOnElementByXpath("/html//a[@id='hlb-ptc-btn-native']");
    }
}
