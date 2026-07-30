package day2drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_NavigateMethods {
    public static void main(String[] args) throws InterruptedException {

        //go to techproeducation home https://www.techproeducation.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.techproeducation.com/");
        Thread.sleep(3000);

        //go to amazon page https://www.amazon.com/
        driver.navigate().to("https://www.amazon.com/");

        //go back to techproeducation page
        driver.navigate().back();

        //go to amazon page again
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();

        //close all page
        driver.quit();
    }
}
