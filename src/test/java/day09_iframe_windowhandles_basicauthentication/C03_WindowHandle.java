package day09_iframe_windowhandles_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class C03_WindowHandle extends TestBase {

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
        String techproWindowHandle = driver.getWindowHandle();

        //verify that the title contains "TechPro Education"
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //open https://www.youtube.com in windows 2(in a neww window)
        driver.switchTo().newWindow(WindowType.WINDOW);//yeni window acar ve driver buraya gecis yapar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //in windows 3 (in a neww window), open https://www.linkedin.com
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //go to the techproeducation page
        driver.switchTo().window(techproWindowHandle);
        waitForSecond(2);

        //go to the youtube page
        driver.switchTo().window(youtubeWindowHandle);
        waitForSecond(2);

        //go to the linkedin page
        driver.switchTo().window(linkedinWindowHandle);
        waitForSecond(2);

    }

    @Test
    void test02() {
        //on windows 1, go to https://www.techproeducation.com
        driver.get("https://www.techproeducation.com");
        String techproWindowHandle = driver.getWindowHandle();

        //verify that the title contains "TechPro Education"
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //open https://www.youtube.com in windows 2(in a neww window)
        driver.switchTo().newWindow(WindowType.TAB);//yeni sekme acar ve driver buraya gecis yapar,yani yan yana acar
        driver.get("https://www.youtube.com");
        String youtubeWindowHandle = driver.getWindowHandle();

        //in windows 3 (in a neww window), open https://www.linkedin.com
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.linkedin.com");
        String linkedinWindowHandle = driver.getWindowHandle();

        //go to the techproeducation page
        driver.switchTo().window(techproWindowHandle);
        waitForSecond(2);

        //go to the youtube page
        driver.switchTo().window(youtubeWindowHandle);
        waitForSecond(2);

        //go to the linkedin page
        driver.switchTo().window(linkedinWindowHandle);
        waitForSecond(2);

    }
}
