package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Cookie;
import utilities.TestBase;

import java.util.Set;

public class C03_Cookies extends TestBase {

    //go to amazon home page
    //print all cookies in the console with a loop
    //test that the number of cookies on the page is greater than 5
    //test that the value of cookies named i18n-prefs is USD
    //create a cookie with the name "my favorite cookie" and the value "chocolate" and add it to the page
    //test that the cookie you added has been added to the page
    //delete the cookie named skin and test whether it is deleted
    //delete all cookies and test if they are deleted


    @Test
    void test01() {
        //go to amazon home page
        driver.get("https://amazon.com");
        waitForSecond(2);

        //print all cookies in the console with a loop
        Set<Cookie> cookieSet = driver.manage().getCookies();
        int counter = 1;
       for (Cookie w:cookieSet){
           System.out.println(counter+" . cookie ==> "+ w);
           System.out.println(counter+" . cookie name==> "+ w.getName());
           System.out.println(counter+" . cookie name==> "+ w.getValue());
           System.out.println("========================================");
           counter++;
       }

        //test that the number of cookies on the page is greater than 5
        int actualSize = cookieSet.size();
        Assertions.assertTrue(actualSize>5);

        //test that the value of cookies named i18n-prefs is USD
        String actualCookieValue = driver.manage().getCookieNamed("i18n-prefs").getValue();
        Assertions.assertEquals("EUR",actualCookieValue);

        //create a cookie with the name "my favorite cookie" and the value "chocolate" and add it to the page
        Cookie cookie = new Cookie("my favorite cookie","chocolate");
        driver.manage().addCookie(cookie);//burada cookie ekledik
        cookieSet = driver.manage().getCookies();

        int counter1 = 1;
        for (Cookie w:cookieSet){
            System.out.println(counter1+" . cookie ==> "+ w);
            System.out.println(counter1+" . cookie name==> "+ w.getName());
            System.out.println(counter1+" . cookie name==> "+ w.getValue());
            System.out.println("========================================");
            counter1++;
        }

        //test that the cookie you added has been added to the page
        //eklediginiz cookie'nin sayfaya eklendigini test edin
        Assertions.assertTrue(cookieSet.contains(cookie));

        //delete the cookie named skin and test whether it is deleted
        //ismi skin olan cookie yi silin ve silindigini test edin
        driver.manage().deleteCookieNamed("skin");
        Assertions.assertNull( driver.manage().getCookieNamed("skin"));

        //delete all cookies and test if they are deleted
        //tum cookie leri silin ve silindigini test edin
        driver.manage().deleteAllCookies();//tum cookileri sildik
        cookieSet=driver.manage().getCookies();//cookieset i tekrar guncelledik
       Assertions.assertTrue( cookieSet.isEmpty());//bos oldugunu dogruladik
    }
}
