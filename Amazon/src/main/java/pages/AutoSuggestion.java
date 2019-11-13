package pages;

import base.CommonAPI;

public class AutoSuggestion extends CommonAPI {
    public void bestlaptops(){
        clickOnElementByXpath("//i[@class='hm-icon nav-sprite']");
        clickOnElementByLinkText("Laptops");
        clickOnElementByLinkText("Macbook Pro");
        sleepFor(2);
    }
}
