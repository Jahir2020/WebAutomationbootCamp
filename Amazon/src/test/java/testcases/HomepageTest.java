package testcases;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;

public class HomepageTest extends CommonAPI {
    Homepage homepage;

    @BeforeMethod

    public void setHomepage(){
        homepage= PageFactory.initElements(driver,Homepage.class);
    }
    @Test
    public void validateSignIn(){
        homepage.signIn();
    }

    @Test
    public void testSearchbar(){
      homepage.clickOnSearchBar();
      homepage.typeOnSearchBar("Macbook Pro");
    }

    @Test
    public void testSearchbutton(){
        homepage.clickOnSearchButton();

    }

}
