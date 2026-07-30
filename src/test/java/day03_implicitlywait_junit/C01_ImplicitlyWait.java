package day03_implicitlywait_junit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_ImplicitlyWait {
    public static void main(String[] args) {



    /*
    bir sayfaya gittiginizde int kaynakli yada ayni anda cok fazla giris yapilmasindan kaynakli
    webelementler hemen yuklenmeyebilir, dolayisiyla islem yapilmak istenen web element henuz yuklenmemisse
    kodlarimiz bu elementi bulamaz ve hata aliriz,
    iste bu nedenle implicitlywait methodu ile bekleme yaparak bu sayfanin yuklenmesini belirtecegimiz
    maximum sure icin bekletme saglariz.
    implicitlywait ile isimizin cogunu hallederiz geriye kalan detaylar icin
     */

      //  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //go to techproeducation page
        driver.get("https://www.techproeducation.com");

        //test that the page title contains TechPro Education
        String expectedData = "TechPro Education";
        String actualData =  driver.getTitle();

        if (actualData.contains(expectedData)){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //go to facebook page
        driver.get("https://www.facebook.com");

        //test that the page url contains facebook
        if (driver.getCurrentUrl().contains("facebook")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //go back to techpro page
        driver.navigate().back();

        //test that you are back
        //first way
        if (driver.getTitle().equals("TechPro Education")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //second way
        if (driver.getCurrentUrl().equals("https://www.techproeducation.com/en")){
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        //close the page
        driver.close();
    }

}
