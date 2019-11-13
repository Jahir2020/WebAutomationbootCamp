package pages;

import base.CommonAPI;
import org.testng.Assert;

public class Search extends CommonAPI {

    public void clickOnSearchButton() {
        clickOnElementByXpath("//input[@type='submit' and @value='Go']");
    }

    public void searchFieldIsTypeAble(){
        Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"), true);
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']", "Story Book");


    }

}
