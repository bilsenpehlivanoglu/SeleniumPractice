package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

public class C02_BasicAuthentication extends TestBase {

    //go to https://https://the-internet.herokuapp.com/basic_auth
    //Username: admin
    //Password: admin
    //Congratulatinos! you must have the proper credentials. verify that the post has appeared
    //click on the elemental selenium link
    //let's test that the header contains elemental selenium


    @Test
    void test01() {
        //go to https://the-internet.herokuapp.com/basic_auth
        //Username: admin
        //Password: admin
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //Congratulatinos! You must have the proper credentials. verify that the post has appeared
        //Congratulatinos! you must have the proper credentials. yazisinin ciktigini dogrulayin
        String actualText = driver.findElement(By.tagName("p")).getText();
        Assertions.assertEquals("Congratulations! You must have the proper credentials.",actualText);

        //click on the elemental selenium link
        driver.findElement(By.partialLinkText("Elemental Selenium")).click();

        //verify test that the header contains elemental selenium
        switchToWindow(1);
        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }
}
