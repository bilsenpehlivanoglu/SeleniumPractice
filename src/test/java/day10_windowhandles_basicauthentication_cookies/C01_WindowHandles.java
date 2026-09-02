package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

import java.util.Set;

public class C01_WindowHandles extends TestBase {

    //go to https://the-internet.herokuapp.com/windows.
    //get the handle value of the first page and print it
    //test that the text on the first page is "Opening a new window"
    //test that the first page title is "The Internet"
    //click the "Click Here" button
    //test that the second page title is "New Window"
    //go back to the first page and test that the title is "The Internet"
    //go to the second page again
    //go back to first page.


    @Test
    void test01() {
        //go to https://the-internet.herokuapp.com/windows.
        driver.get("https://the-internet.herokuapp.com/windows");

        //get the handle value of the first page and print it
        String handleValueOfFirstPage = driver.getWindowHandle();

        //test that the text on the first page is "Opening a new window"
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);

        //test that the first page title is "The Internet"
        Assertions.assertEquals("The Internet",driver.getTitle());

        //click the "Click Here" button
        driver.findElement(By.linkText("Click Here")).click();

        //test that the second page title is "New Window"
        Set<String> windows = driver.getWindowHandles();
        for (String w: windows){
            if (!w.equals(handleValueOfFirstPage)){
                driver.switchTo().window(w);
            }
        }
        waitForSecond(2);
        String handleValueOfSecondPage = driver.getWindowHandle();
        Assertions.assertEquals("New Window",driver.getTitle());

        //go back to the first page and test that the title is "The Internet"
        driver.switchTo().window(handleValueOfFirstPage);
        Assertions.assertEquals("The Internet",driver.getTitle());

        waitForSecond(2);
        //go to the second page again
        driver.switchTo().window(handleValueOfSecondPage);

        waitForSecond(2);
        //go back to first page.
        driver.switchTo().window(handleValueOfFirstPage);
    }

    @Test
    void test02() { //testbase den method kullanarak
        //go to https://the-internet.herokuapp.com/windows.
        driver.get("https://the-internet.herokuapp.com/windows");

        //get the handle value of the first page and print it


        //test that the text on the first page is "Opening a new window"
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("Opening a new window",actualText);

        //test that the first page title is "The Internet"
        Assertions.assertEquals("The Internet",driver.getTitle());

        //click the "Click Here" button
        driver.findElement(By.linkText("Click Here")).click();

        //test that the second page title is "New Window"
        switchToWindow(1);
        waitForSecond(2);
        String handleValueOfSecondPage = driver.getWindowHandle();
        Assertions.assertEquals("New Window",driver.getTitle());

        //go back to the first page and test that the title is "The Internet"
        switchToWindow(0);
        Assertions.assertEquals("The Internet",driver.getTitle());

        waitForSecond(2);
        //go to the second page again
        switchToWindow(1);

        waitForSecond(2);
        //go back to first page.
        switchToWindow(0);
    }
}
