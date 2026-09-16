package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class AC_05 extends TestBase {

    @Test
    void test01() {
        //go to google home page
        driver.get("https://google.com");
        waitForSecond(5);

        //Hold down the Shift key and type "selenium" in the search box, then release Shift and type "java".
        //arama kutusuna shift tusuna basili olarak selenium yazdirin ve shift tusunu serbest birakarak java yazin.
        WebElement searchBox = driver.findElement(By.id("ti6dpd"));
        Actions actions = new Actions(driver);
        actions.keyDown(searchBox,Keys.SHIFT).
                sendKeys("selenium").
                keyUp(Keys.SHIFT)
                .sendKeys(" -java",Keys.ENTER).perform();
        waitForSecond(40);


    }

    @Test
    void test02() {
        //go to google home page
        driver.get("https://google.com");
        waitForSecond(5);

        //Hold down the Shift key and type "selenium" in the search box, then release Shift and type "java".
        //arama kutusuna shift tusuna basili olarak selenium yazdirin ve shift tusunu serbest birakarak java yazin.
        WebElement searchBox = driver.findElement(By.id("ti6dpd"));
        searchBox.sendKeys(Keys.SHIFT,"Selenium",Keys.SHIFT,"  -java",Keys.ENTER);
        waitForSecond(50);


    }
}
