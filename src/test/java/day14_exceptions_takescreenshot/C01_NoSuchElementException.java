package day14_exceptions_takescreenshot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {

    @Test
    void test01() {
        driver.get("https://techproeducation.com");

        WebElement button = driver.findElement(By.xpath("//button[@type='button']"));
        button.click();
    }
}
