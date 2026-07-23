package day1_firstdriverdetting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {

    public static void main(String[] args) {


        //chromedriver seleniumdan gelen komutlari alir ve chrome un anlayabilecegi sekle cevirir,
        // bunun icin System.setProperty methodu ile seleniuma chromedriver in
        // konumunu bildirerek dogru bir sekilde baslatilmasini saglar

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.quit();


    }
}
