package day10_windowhandles_basicauthentication_cookies;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class QATESTSIDE_02 extends TestBase {

    @Test
    void test01() {
        Faker faker = new Faker();

        //go to https://www.globalsga.com/samplepagetest/
        driver.get("https://www.globalsqa.com/samplepagetest/");
        waitForSecond(5);

        //fill textboxes with fake data
        WebElement nameBox = driver.findElement(By.id("g2599-name"));
        nameBox.sendKeys(faker.name().firstName(), Keys.TAB,
                faker.internet().emailAddress(),Keys.TAB,
                faker.internet().domainName());

    }
}
