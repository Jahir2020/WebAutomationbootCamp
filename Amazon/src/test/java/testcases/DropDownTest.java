package testcases;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.Homepage;

import java.util.List;

public class DropDownTest extends Homepage {

    @Test
    public void testAllDropDownMenu() {
        List<WebElement> elementList = getAllElementFromList();
        System.out.println(elementList.size());
        for (int i = 0; i < elementList.size(); i++) {
            System.out.println(elementList.get(i).getText());
        }

    }

}
