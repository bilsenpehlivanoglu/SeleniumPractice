package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class AC_02 extends TestBase {

    @Test
    void test01() {
        //go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //go to the "Account & Lists" menu in the upper right section and click on the "Account" option
        WebElement account = driver.findElement(By.xpath("//span[.='Account']"));
        WebElement list = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(list).perform();

        actions.click(account).perform();

        //verify that the title of the opened page contains "Your Account"
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));



    }
}
