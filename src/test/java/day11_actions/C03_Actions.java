package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C03_Actions extends TestBase {

    //go to techproeducation
    //Scroll down the page.
    //Scroll up the page.

    //go to techproeducation
    //Scroll to the bottom of the page.
    //Scroll to the top of the page.

    //go to techproeducation
    //Scroll down until you see the word "Events".
    //Aşağıya doğru kaydırarak "Etkinlikler" kelimesini görene kadar ilerleyin.



    @Test
    void test01() {
        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll down the page.
        Actions actions = new Actions(driver);

        for (int i = 0; i<3 ; i++){
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            waitForSecond(2);
        }


        //Scroll up the page.
        for (int i = 0; i<3 ; i++){
            actions.sendKeys(Keys.PAGE_UP).perform();
            waitForSecond(2);
        }
    }

    @Test
    void test02() {
        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll to the bottom of the page.//en alti
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.END).perform();
        waitForSecond(2);

        //Scroll to the top of the page.//en ustu
        actions.sendKeys(Keys.HOME).perform();
        waitForSecond(2);
    }

    @Test
    void test03() {
        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll down until you see the word "Your path to enrollment".
        //Aşağıya doğru kaydırarak "Your path to enrollment" kelimesini görene kadar ilerleyin.
        WebElement enrollmentText = driver.findElement(By.xpath("//h2[.='Your path to enrollment']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(enrollmentText).perform();


    }
}


