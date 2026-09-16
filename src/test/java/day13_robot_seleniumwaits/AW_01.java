package day13_robot_seleniumwaits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class AW_01 extends TestBase {

    @Test
    void test01() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //press the start button
        WebElement startButton = driver.findElement(By.xpath("//button[.='Start']"));
        startButton.click();

        //Hello World! yazisinin sitede oldugunu test et.
        WebElement text = driver.findElement(By.xpath("//*[.='Hello World!']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOf(text));

        //Verify the "Hello World!" message is present on the site.
        Assertions.assertTrue(text.isEnabled());


        //element hemen gorunmdigi icin wait tanimlayacagiz

    }
}
