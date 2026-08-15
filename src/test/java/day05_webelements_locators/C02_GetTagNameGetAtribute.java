package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_GetTagNameGetAtribute {

    //go to techproeducation page
    //test that the tag name of the search box is input
    //test that the value of the search box's class attribute is form-input
    //close the page

    @Test
    void test01(){
        //go to techproeducation page
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://techproeducation.com");

        //test that the tag name of the search box is input
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String expectedTagName = "input";
        String actualTagName = searchBox.getTagName();
        Assertions.assertEquals(expectedTagName,actualTagName);

        //test that the value of the search box's class attribute is form-input
        String actualAttributeValue = searchBox.getAttribute("class");
        String expectedAttributeValue = "form-input";
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);

        //close the page
        driver.quit();
    }

}
