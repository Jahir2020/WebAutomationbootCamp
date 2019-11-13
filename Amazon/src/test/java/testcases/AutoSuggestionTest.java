package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.NavigateProducts;

public class AutoSuggestionTest extends CommonAPI {

    @Test
    public void setAutoSuggestion() {
        setAutoSuggestion();
    }

    NavigateProducts navigateProduct;
    @BeforeMethod
    public void getnavigateproduct() {
        navigateProduct = PageFactory.initElements(driver, NavigateProducts.class);
    }
}