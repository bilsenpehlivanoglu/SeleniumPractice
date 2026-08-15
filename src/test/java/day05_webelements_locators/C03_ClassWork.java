package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ClassWork {

    //go to https://testcenter.techproeducation.com/index.php
    //test whether the "Back to Techproeducation.com" button is enable for user access
    //test whether the "Applications lists" title is visible by locating it with the tagname


    @Test
    void test01() {
        //go to https://testcenter.techproeducation.com/index.php
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.testcenter.techproeducation.com/index.php");

        //test whether the "Back to Techproeducation.com" button is enable for user access
        //"Back to Techproeducation.com" buttonun kullanici ersimi icin etkin olup olmadigini test edin
        WebElement backToButton = driver.findElement(By.partialLinkText("Back to Techproeducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());
        //isEnabled()); erisilebilir mi

        //test whether the "Applications lists" title is visible by locating it with the tagname
        //"Applications lists" basligini tagname ile locate ederek gorunur olup olmadigini test ediniz
        WebElement applicationsList = driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationsList.isDisplayed());
        //isDisplayed()); gorunur mu

        driver.quit();

    }
}
