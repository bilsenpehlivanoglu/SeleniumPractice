package day06_xpath_css;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_XPathClassWork {

    //https://the-internet.herokuapp.com/add_remove_elements/
    //press the add element button
    //test that the delete button is visible
    //press the delete key
    //test that the "Add/Remove Elements" text is visible
    //close the page


    @Test
    void test01() throws InterruptedException {
        //https://the-internet.herokuapp.com/add_remove_elements/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //press the add element button
         driver.findElement(By.xpath("//*[.='Add Element']")).click();

        //test that the delete button is visible
        WebElement deleteButton = driver.findElement(By.xpath("//*[.='Delete']"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        //press the delete key
        Thread.sleep(2000);
        deleteButton.click();

        //test that the "Add/Remove Elements" text is visible
        WebElement addRemoveText = driver.findElement(By.xpath("//*[.='Add/Remove Elements']"));
        Assertions.assertTrue(addRemoveText.isDisplayed());

        //close the page
        driver.quit();
    }
}
