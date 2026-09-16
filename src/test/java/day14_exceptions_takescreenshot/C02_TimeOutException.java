package day14_exceptions_takescreenshot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;

import java.time.Duration;

public class C02_TimeOutException extends TestBase {

    @Test
    void test01() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //press the start button
        driver.findElement(By.xpath("//button[.='Start']")).click();

        //Hello World! yazisinin sitede oldugunu test et.
        //Verify the "Hello World!" message is present on the site.
        //element hemen gorunmdigi icin wait tanimlayacagiz
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement helloWorld = driver.findElement(By.xpath("//*[.='Hello World!']"));
        wait.until(ExpectedConditions.visibilityOf(helloWorld));

        Assertions.assertEquals("Hello World!",helloWorld.getText());
    }
}
