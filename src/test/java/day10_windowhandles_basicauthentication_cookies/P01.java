package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class P01 extends TestBase {

    @Test
    void test01() {
        //go to https://the-internet.herokuapp.com/windows.
        driver.get("https://the-internet.herokuapp.com/windows");

        //get the handle value of the first page and print it
        String firstPage = driver.getWindowHandle();

        //test that the text on the first page is "Opening a new window"
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);

        //test that the first page title is "The Internet"

        Assertions.assertTrue(driver.getTitle().contains("The Internet"));

        //click the "Click Here" button
        driver.findElement(By.linkText("Click Here")).click();

        //test that the second page title is "New Window"
        switchToWindow(1);
        String secondPage = driver.getWindowHandle();
        Assertions.assertEquals("New Window",driver.getTitle());

        //go back to the first page and test that the title is "The Internet"
       switchToWindow(0);
       Assertions.assertEquals("The Internet",driver.getTitle());

        //go to the second page again
        switchToWindow(1);

        //go back to first page.
        switchToWindow(0);
    }
}
