package day07_css_relativelocators_dropdown;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_RelativeLocators {

    //go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
    //locate berlin with locator
    //test that relative locators are working correctly
    //close the page


    @Test
    void test01() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to https://www.diemol.com/selenium-4-demo/relative-locators-demo.html
        driver.get("https://www.diemol.com/selenium-4-demo/relative-locators-demo.html");

        //locate berlin with locator
        //test that relative locators are working correctly
        //close the page
    }
}
