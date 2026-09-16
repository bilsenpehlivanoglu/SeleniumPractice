package day11_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class P02 extends TestBase {

    @Test
    void test01() {
        //go to https://https://the-internet.herokuapp.com/basic_auth
        //Username: admin
        //Password: admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


        //Congratulatinos! you must have the proper credentials. verify that the post has appeared
        WebElement text = driver.findElement(By.tagName("p"));
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",text.getText());

        //click on the elemental selenium link
        driver.findElement(By.xpath("//a[.='Elemental Selenium']")).click();

        //let's test that the header contains elemental selenium
        switchToWindow(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }
}
