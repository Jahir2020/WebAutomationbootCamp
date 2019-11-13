package pages;

import base.CommonAPI;
import org.openqa.selenium.By;

public class NavigateProducts extends CommonAPI {
    public void productinfo(){
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']","mobile phones");
        clickOnElementByXpath("//input[@type='submit']");
        sleepFor(2);
        clickOnElementByXpath("//li[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]" );
        System.out.println(driver.findElement(By.xpath("//div[@id='feature-bullets']")).getText());
    }
}

