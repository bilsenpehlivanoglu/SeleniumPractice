package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class AC_04 extends TestBase {



    @Test
    void test01() {
        Actions actions = new Actions(driver);
        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll down the page.
        for (int i =0 ; i<3 ; i++){
            actions.sendKeys(Keys.DOWN).perform();
        }


        //Scroll up the page.
        for (int i = 0; i<3; i++){
            actions.sendKeys(Keys.UP);
        }

    }

    @Test
    void test02(){
        Actions actions = new Actions(driver);

        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll to the bottom of the page.
        actions.sendKeys(Keys.END).perform();
        waitForSecond(2);

        //Scroll to the top of the page.
        actions.sendKeys(Keys.HOME).perform();
        waitForSecond(2);

    }

    @Test
    void test03() {

        Actions actions = new Actions(driver);

        //go to techproeducation
        driver.get("https://techproeducation.com");

        //Scroll down until you see the word "Events".
        //Aşağıya doğru kaydırarak "Etkinlikler" kelimesini görene kadar ilerleyin.
        WebElement enrollment = driver.findElement(By.xpath("//h2[.='Your path to enrollment']"));
        actions.moveToElement(enrollment).perform();



    }
}
