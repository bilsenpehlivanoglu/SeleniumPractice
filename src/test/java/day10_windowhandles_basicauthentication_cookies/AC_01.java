package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class AC_01 extends TestBase {

    @Test
    void test01() {
        //go to https://the-internet.herokuapp.com/context_menu
        driver.get("https://the-internet.herokuapp.com/context_menu");

        //right click on the box
        WebElement click = driver.findElement(By.id("hot-spot"));
        Actions actions = new Actions(driver);
        actions.contextClick(click).perform();//contextClick sag click icin kullanilir

        //test that the text appearing in Alert is "You selected a context menu"
        //alert te cikan yazinin "You selected a context menu" oldugunu test edin
        String actualText = driver.switchTo().alert().getText();
        String expectedText = "You selected a context menu";
        Assertions.assertEquals(expectedText,actualText);

        //close the alert by clicking OK
        driver.switchTo().alert().accept();
    }
}
