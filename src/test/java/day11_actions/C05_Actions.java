package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C05_Actions extends TestBase {

    //go to google home page
    //Hold down the Shift key and type "selenium" in the search box, then release Shift and type "java".
    //arama kutusuna shift tusuna basili olarak selenium yazdirin ve shift tusunu serbest birakarak java yazin.


    @Test
    void test01() {
        //go to google home page
        driver.get("https://www.google.com");
        waitForSecond(4);

        //Hold down the Shift key and type "selenium" in the search box, then release Shift and type "java".
        //arama kutusuna shift tusuna basili olarak selenium yazdirin ve shift tusunu serbest birakarak java yazin.
        WebElement searchBox = driver.findElement(By.id("ti6dpd"));
        Actions actions = new Actions(driver);
        actions.keyDown(searchBox, Keys.SHIFT)//arama kutusuna shift tusuna basili tutar
                .sendKeys("selenium")//box a selenium yazdik
                .keyUp(Keys.SHIFT)//shift tusundan elini kaldirir
                .sendKeys("  - java",Keys.ENTER).perform();
        waitForSecond(10);

    }

    @Test
    void test02() {
        //go to google home page
        driver.get("https://www.google.com");
        waitForSecond(4);

        //Hold down the Shift key and type "selenium" in the search box, then release Shift and type "java".
        //arama kutusuna shift tusuna basili olarak selenium yazdirin ve shift tusunu serbest birakarak java yazin.
        WebElement searchBox = driver.findElement(By.id("ti6dpd"));
        searchBox.sendKeys(Keys.SHIFT,"selenium",Keys.SHIFT,"  -java",Keys.ENTER);//1.shifte elini basar, ikinci shift te elini kaldirir.

        waitForSecond(10);

    }
}
