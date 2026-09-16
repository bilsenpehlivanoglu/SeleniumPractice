package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WindowType;
import utilities.TestBase;

public class P02 extends TestBase {

    @Test
    void test01() {
        //on windows 1, go to https://www.techproeducation.com
        driver.get("https://www.techproeducation.com");
        String techpro = driver.getWindowHandle();

        //verify that the title contains "TechPro Education"
        Assertions.assertTrue(driver.getTitle().contains("TechPro Education"));

        //open https://www.youtube.com in windows 2(in a neww window)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.youtube.com");
        String youtube = driver.getWindowHandle();

        //in windows 3 (in a neww window), open https://www.linkedin.com
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.linkedin.com");
        String linkedin = driver.getWindowHandle();

        //go to the techproeducation page
        driver.switchTo().window(techpro);

        //go to the youtube page
        driver.switchTo().window(youtube);

        //go to the linkedin page
        driver.switchTo().window(linkedin);
    }
}
