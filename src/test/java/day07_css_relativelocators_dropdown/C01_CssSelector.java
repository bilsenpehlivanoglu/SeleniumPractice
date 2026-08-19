package day07_css_relativelocators_dropdown;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_CssSelector {

    /*
    Syntax:
    1)    tagname [ attributename = 'attributevalue']
    2)    eger id ile css locate almak istersek o zmn   #idattributevalue   koyuyoruz
    3)    eger class ile css locate almak istersek     .classattributevalue   yaziyoruz

    XPath ile css selector arasindaki farklar
    1) xpath ile bir webelement icin birden fazla sonuc olursa index kullanabiliriz,
       fakat css ile index kullanilmaz
    2) xpath ile bir webelementin sadece text i ile locate edilebilir, fakat
       css ile bunu yapamayiz
    3) Css, Xpath e gore daha hizlidir
     */

    //https://the-internet.herokuapp.com/add_remove_elements/
    //press the add element button
    //test that the delete button is visible
    //press the delete key
    //test that the "Add/Remove Elements" text is visible
    //close the page


    @Test
    void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //press the add element button
        driver.findElement(By.cssSelector("button[onclick='addElement()']")).click();

        //test that the delete button is visible
        WebElement deleteButton = driver.findElement(By.cssSelector("button[onclick='deleteElement()']"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        //press the delete key
        Thread.sleep(3000);
        deleteButton.click();

        //test that the "Add/Remove Elements" text is visible
        WebElement addRemove = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemove.isDisplayed());
        Thread.sleep(3000);

        //close the page
        driver.quit();



    }
}
