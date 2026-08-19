package day06_xpath_css;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar02 {

    @Test
    void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //https://the-internet.herokuapp.com/add_remove_elements/
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //press the add element button
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();

        //test that the delete button is visible
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        //press the delete key
        Thread.sleep(3000);
        deleteButton.click();

        //test that the "Add/Remove Elements" text is visible
        WebElement addRemove = driver.findElement(By.xpath("//h3[.='Add/Remove Elements']"));
        Assertions.assertTrue(addRemove.isDisplayed());

        //close the page
        driver.quit();
    }
}
