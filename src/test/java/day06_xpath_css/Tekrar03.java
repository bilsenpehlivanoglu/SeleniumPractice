package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar03 {

    @Test
    void test03() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //locate checkbox1 and checkbox2 elements
        WebElement checkbox1 = driver.findElement(By.xpath("//input[@type='checkbox'][1]"));
        WebElement checkbox2 = driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

        //if checkbox1 is not selected, click the checkbox1
        if (!checkbox1.isSelected()){
            checkbox1.click();
        }

        //if checkbox2 is not selected, click the checkbox2
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }

        //close the page
        driver.quit();
    }
}
