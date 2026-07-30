package day2drivermethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C04_MnageMethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to techproeducation page https://www.techproeducation.com/
        driver.get("https://www.techproeducation.com/");

        //sayfanin boyutlarini yazdirin
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //sayfayi simge durumuna getirin
        //Print the page dimensions
        driver.manage().window().minimize();

        //simge durumunda 3 saniye bekleyip sayfayi maximize yapin
        //Wait the icon for 3 seconds, then maximize the page.
        Thread.sleep(3000);
        driver.manage().window().maximize();

        //sayfanin konumunu ve boyutlarini maximize durumunda yazdirin
        //Maximize the page position and dimensions before printing.
        System.out.println("driver.manage().window().getSize() = " + driver.manage().window().getSize());

        //sayfayi fullscreen yapin
        //Make the page fullscreen.
        driver.manage().window().fullscreen();

        //close the page
        driver.close();

    }
}
