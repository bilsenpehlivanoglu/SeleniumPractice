package day04_assertions_webelements_locators;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_AssertionsTest {

    //go to google website
    //verify that the page title is google
    //close the page

    //go to google website
    //verify that the page url is https://www.google.com
    //close the page


    WebDriver driver;
    @BeforeEach
    void setUp() {
        //go to google website
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.google.com");

    }

    @Test
    void testPageTitle() {
        //verify that the page title is google
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assertions.assertEquals(expectedTitle,actualTitle);

    }

    @Test
    void testUrl() {
        //verify that the page url is https://www.google.com
        String expectedUrl = "https://www.google.com/";
        String actualUrl = driver.getCurrentUrl();
        Assertions.assertEquals(expectedUrl,actualUrl);

    }

    @AfterEach
    void tearDown() {
        //close the page
        driver.quit();
    }
}
