package day09_iframe_windowhandles_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class C04_WindowHandle extends TestBase {

    //on windows 1, go to https://www.techproeducation.com
    //verify that the title contains "TechPro Education"
    //open https://www.youtube.com in windows 2(in a neww window)
    //in windows 3 (in a neww window), open https://www.linkedin.com
    //go to the techproeducation page
    //go to the youtube page
    //go to the linkedin page


    @Test
    void test01() {
        //on windows 1, go to https://www.techproeducation.com
        driver.get("https://www.techproeducation.com");

        //verify that the title contains "TechPro Education"
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //open https://www.youtube.com in windows 2(in a neww window)
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni sekme acar ve driver buraya gecis yapar,yani yan yana acar
        driver.get("https://www.youtube.com");

        //in windows 3 (in a neww window), open https://www.linkedin.com
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");

        /*
        acilmis olan tum pencelerin window handle degerlerini get window handles methodu ile aldik
        bu method bize set return eder, ancak set lerde index kullanarak istedigimiz bir elemani secmek mumkun degildir
        bu nedenle bizde bu set i kullanarak bir tane list olusturduk
         */
        //go to the techproeducation page
      //  List<String> windowsList = new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(driver.getWindowHandles().toArray()[0].toString());
        waitForSecond(2);

        //go to the youtube page
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());
        waitForSecond(2);

        //go to the linkedin page
        driver.switchTo().window(driver.getWindowHandles().toArray()[2].toString());
        waitForSecond(2);

    }
}
