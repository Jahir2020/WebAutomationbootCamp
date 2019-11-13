package testcases;

import org.testng.annotations.Test;
import pages.Checkout;

public class CheckoutTest extends Checkout {


    @Test
    public void browsingProducts(){
        validateProduct();
        validateshoppingCart();
        validateCheckout();
        validShopperClickable();
        validateshopperDisplayed();
        sleepFor(3);
    }
}

