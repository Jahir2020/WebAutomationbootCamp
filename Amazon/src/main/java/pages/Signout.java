package pages;

import base.CommonAPI;

public class Signout extends CommonAPI {

    Homepage homepage =new Homepage();
    Loginpage loginpage =new Loginpage();

    public void validateSignout(){
        homepage.signIn();
        homepage.clickOnSearchBar();
        homepage.clickOnSearchButton();
        homepage.typeOnSearchBar("Macbook Pro");

        clickOnElementByXpath("//a[@id='nav-item-signout']");
    }

}
