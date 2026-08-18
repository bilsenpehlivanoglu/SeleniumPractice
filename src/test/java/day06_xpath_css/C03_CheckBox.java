package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_CheckBox {

    //go to https://the-internet.herokuapp.com/checkboxes
    //locate checkbox1 and checkbox2 elements
    //if checkbox1 is not selected, click the checkbox1
    //if checkbox2 is not selected, click the checkbox2
    //close the page

    @Test
    void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to https://the-internet.herokuapp.com/checkboxes
        driver.get("https://the-internet.herokuapp.com/checkboxes");

        //locate checkbox1 and checkbox2 elements
        WebElement checkBox1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
        WebElement checkBox2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

        //if checkbox1 is not selected, click the checkbox1
        Thread.sleep(3000);

        if (!checkBox1.isSelected()){
            checkBox1.click();
        }
        //if checkbox2 is not selected, click the checkbox2
        Thread.sleep(3000);

        if (!checkBox2.isSelected()){
            checkBox2.click();
        }
        Thread.sleep(3000);

        //close the page
        Thread.sleep(3000);
        driver.quit();
    }
}
