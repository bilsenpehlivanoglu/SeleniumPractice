package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_WebelementsLocators {

    //go to google page
    //find the search box according to the "name" attribute and type "selenium"
    //make the call
    //test that the header contains selenium
    //print how many links are on the page to the console
    //if the links on the page have text, print them to the console//sayfadaki linklerin metinleri varsa concole yazdirin
    //close the page

    @Test
    void test01() throws InterruptedException {
        //go to google page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.google.com");
        Thread.sleep(5000);

        //find the search box according to the "name" attribute and type "selenium"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");
        Thread.sleep(5000);


        //make the call
        searchBox.submit();


        //test that the header contains selenium
        Thread.sleep(5000);
        Assertions.assertTrue(driver.getTitle().contains("selenium"));

        //print how many links are on the page to the console
        Thread.sleep(5000);
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        //if the links on the page have text, print them to the console
        // sayfadaki linklerin metinleri varsa concole yazdirin
        Thread.sleep(5000);
        for (WebElement w :links){
            if (!w.getText().isEmpty()){
                System.out.println(w.getText());
            }

        }
        //close the page

    }
}
