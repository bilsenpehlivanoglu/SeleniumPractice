package day12_faker_files;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_FakerTest extends TestBase {

    //go to https://www.globalsga.com/samplepagetest/
    //fill textboxes with fake data

    @Test
    void fakerTest() {
        //go to https://www.globalsga.com/samplepagetest/
        driver.get("https://www.globalsqa.com/samplepagetest/");
        waitForSecond(3);

        //fill textboxes with fake data
        Faker faker = new Faker();

        WebElement nameBox = driver.findElement(By.id("g2599-name"));
        nameBox.sendKeys(faker.name().firstName(), Keys.TAB,
        faker.internet().emailAddress(),Keys.TAB,
        faker.internet().domainName());

        WebElement commentBox = driver.findElement(By.id("contact-form-comment-g2599-comment"));
        commentBox.sendKeys(faker.lorem().paragraph());




    }
}
