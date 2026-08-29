package day09_iframe_windowhandles_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_Iframe extends TestBase {

    //go to https://the-internet.herokuapp.com/iframe
    //verify that the bold text contains the word "Editor"
    //delete the text in the textbox
    //instead of the textvyou deleted, write "This textbox is located in iFrame"
    //verify that the "Elemental Selenium" text is on the page


    @Test
    void test01() {
        driver.get("https://the-internet.herokuapp.com/iframe");
        waitForSecond(3);

        //verify that the bold text contains the word "Editor"
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertTrue(actualText.contains("Editor"));

        //delete the text in the textbox
        driver.switchTo().frame("mce_0_ifr"); //iframe icine giris yaptik
//        WebElement textBox = driver.findElement(By.xpath("//p"));
//        textBox.clear();

        //instead of the text you deleted, write "This textbox is located in iFrame"
      //  textBox.sendKeys("This textbox is located in iFrame");

        //verify that the "Elemental Selenium" text is on the page
        driver.switchTo().defaultContent();
        WebElement elementalSelenium = driver.findElement(By.partialLinkText("Elemental Selenium"));
        Assertions.assertEquals("Elemental Selenium",elementalSelenium);

    }

    //https://html.com/tags/frame sayfasinda gidiniz ve youtube videosuna tiklayiniz
}
