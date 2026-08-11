package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar {

    @Test
    void test(){
        //go to amazon page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        //locate the search box and print search for iphone
      //  WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
      //  search.sendKeys("iphone", Keys.ENTER);

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);

        //close the page
        driver.quit();
    }
}
