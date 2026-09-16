package day13_robot_seleniumwaits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import utilities.TestBase;

import java.time.Duration;

public class C03_ExplicitWait_FluentWait extends TestBase {

    @Test
    void test01() {
        //https://the-internet.herokuapp.com/dynamic_loading/1
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        //press the start button
        driver.findElement(By.tagName("button")).click();

        //Verify the "Hello World!" message is present on the site.
        FluentWait<WebDriver> wait = new FluentWait<>(driver);

        WebElement helloWorld = driver.findElement(By.xpath("//*[.='Hello World!']"));

        wait.withTimeout(Duration.ofSeconds(20))//max bekleme suresini yazdik
                .pollingEvery(Duration.ofMillis(200))//belirttigimiz araliklarla kontrol ediyoruz
                .withMessage("Check web element and time")//eger belirtilen max sure icinde kosul saglanmaz ise
                // burada yazdigimiz hata mesaji ile timeoutexception gorunur
                .until(ExpectedConditions.visibilityOf(helloWorld));//webelementin gorunur olup olmadigi kosulu kontrol eder

        Assertions.assertEquals("Hello World!",helloWorld.getText());
    }
}
