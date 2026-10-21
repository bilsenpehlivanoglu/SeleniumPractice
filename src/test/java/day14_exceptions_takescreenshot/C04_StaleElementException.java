package day14_exceptions_takescreenshot;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C04_StaleElementException extends TestBase {


    /*
    StaleElementException nasil alnir?
    Bir sayfadaki webelementi locate ettikten sonra o sayfada yenileme yapan bir islem yapildiginda
    (navigate methodlari:back,refresh,forward) yapildiginda locate aldigimiz webelementi tekrar kullaninca bu exception u aliriz

    handle etmek icin:?
    webelementi tekrar locate etmeliyiz

     */

    @Test
    void test01() {
        driver.get("https://techproeducation.com");

        WebElement search = driver.findElement(By.id("searchHeaderInput"));

        driver.navigate().refresh();

        //staleelementexception aldigimizda locate i yenilemeliyiz
        search = driver.findElement(By.id("searchHeaderInput"));

        search.sendKeys("Tea is fresh");

        /*
        elementclickinterceptedexception? :click yapilamk istenen elementin uzeri ortulmus demektir
         */

    }
}
