package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Homepage;
import pages.ResultPage;

import java.util.List;

public class SearchTest extends Homepage {

    ResultPage resultPage = new ResultPage();

    @Test
    public void validateSearchButtonWorks() {
        clickOnSearchBar();
        typeOnSearchBar("Mobile Phones");
        clickOnSearchButton();
        sleepFor(2);
        resultPage.validateSearchPageDisplayed();
    }


    @Test
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }

    }
}