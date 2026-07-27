package day2drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_GetMethodsTest {
    public static void main(String[] args) {

        //go to Techproeducation page https://www.techproeducation.com/
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techproeducation.com/");

        //print the page title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //test if the page title contains "Education"
        if (actualTitle.contains("Education")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }
        //print the page address (url)
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        //test that the pahe url contains "education"
        if (actualUrl.contains("education")){
            System.out.println("Test Passed ");
        }else {
            System.out.println("Test Failed ");
        }
        //print the page handle value
        String windowHandle = driver.getWindowHandle();
        System.out.println("windowHandle = " + windowHandle);

        //test whether the word "IT Programs" appears in the page HTML codes
        String pageSource = driver.getPageSource();
        if (actualUrl.contains("IT Programs")){
            System.out.println("Test Passed ");
        }else {
            System.out.println("Test Failed ");
        }
        //close the page
        driver.close();


    }
}
