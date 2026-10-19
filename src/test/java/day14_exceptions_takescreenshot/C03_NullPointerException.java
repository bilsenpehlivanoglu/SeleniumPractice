package day14_exceptions_takescreenshot;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;

public class C03_NullPointerException {

    WebDriver driver;

    Faker faker;

    Action action;

    String str;

    @Test
    void test01() {
        driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    void test02() {
      faker = new Faker();
        System.out.println(faker.name().fullName());
    }

    @Test
    void test03() {
       action.perform();

    }

    @Test
    void test04() {
        System.out.println(str.length());
    }
}

