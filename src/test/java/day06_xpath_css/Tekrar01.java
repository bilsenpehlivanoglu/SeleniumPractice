package day06_xpath_css;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Tekrar01 {

    @Test
    void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //go to https://www.amazon.com/
        driver.get("https://www.amazon.com/");
        Thread.sleep(3000);

        //search "iphone" in the search box (locate the search box with xpath)
        WebElement searchBox = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        searchBox.sendKeys("iphone", Keys.ENTER);

        //print the number of relevant results displayed on amazon
        WebElement resultText =
                driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
        System.out.println("Result text = " + resultText.getText());//1-16 of 114 results for "iphone"

        //just print the result number
        System.out.println("Number of Results = " + resultText.getText().split(" ")[2]);

        //then click on the text of the first result that appears
        WebElement textResult =
                driver.findElement(By.partialLinkText("iPhone 16 Silicone Case with MagSafe and Camera Control: Lightweight Phone Case, Wireless Charging Compatible, Smooth Matte Finish; Fuchsia"));
        textResult.click();

        //close the page
        driver.quit();
    }
}
