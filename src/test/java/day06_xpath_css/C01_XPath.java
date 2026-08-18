package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XPath {

    /*
    / -> bir alt childi secer
    // -> sayfadaki herhangi bir webelementi secer //div
    @ -> bir webelementin attribute unu secmek icin kullanilir
    [] -> Index veya kosul belirtmek icin kullanilir
    * -> All farketmeksizin sec demektir

    SYNTAX
    //tagname [ @attributeName = 'attributeValue' ]
    //*       [ @     *        = 'attributeValue' ]
    (//tagname [ @attributeName = 'attributeValue' ]) [index]

     */

    //go to https://www.amazon.com/
    //search "city bike" in the search box (locate the search box with xpath)
    //print the number of relevant results displayed on amazon
    //just print the result number
    //then click on the text of the first result that appears
    //close the page

    @Test
    void test01() throws InterruptedException {
        //go to https://www.amazon.com/
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.amazon.com/");

        Thread.sleep(5000);

        //search "city bike" in the search box (locate the search box with xpath)
       WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
       searchBox.sendKeys("city bike", Keys.ENTER);

        //print the number of relevant results displayed on amazon
        WebElement resultText = driver.findElement(By.xpath("(//div[@class='sg-col-inner'])[1]"));
        System.out.println("resultText = " + resultText.getText());//1-16 of over 10,000 results for "city bike"

        //just print the result number
        System.out.println("Number of results= " + resultText.getText().split(" ")[3]);//10,000

        //then click on the text of the first result that appears
        driver.findElement(By.xpath("(//h2)[4]/a")).click();

        //close the page
          driver.quit();

    }
}
