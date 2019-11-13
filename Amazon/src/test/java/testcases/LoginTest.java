package testcases;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

@Test
public class LoginTest extends CommonAPI {
    public void logintest() {
        driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
        driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("jahirtanvir2020@gmail.com");
        driver.findElement(By.xpath("//input[@id='continue']")).click();
        sleepFor(2);
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Komol2borna");
        driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();

    }
}
