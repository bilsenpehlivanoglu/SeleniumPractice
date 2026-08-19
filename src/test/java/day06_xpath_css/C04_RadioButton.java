package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_RadioButton {

    //go to https://www.facebook.com
    //click the "Create an Account" button
    //locate "radio buttons" elements
    //if it is not selected, choose the one that suits you from the gender button.


    @Test
    void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        Thread.sleep(5000);

        //click the "Create an Account" button
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();

        //locate "radio buttons" elements
        //if it is not selected, choose the one that suits you from the gender button.
    }
}
