package day08_testbase_alert;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C02_TestBaseClassWork extends TestBase {

    /*
    https://testcenter.techproeducation.com/index.php?page=dropdown
    year, mounts,day dropdown menulerden reusable method kullanin
     */

    @Test
    void voidreusableMethodUsage() {
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        waitForSecond(2);
        selectIndex(year,0);
        selectIndex(month,1);
        selectIndex(day,2);

        selectVisible(year,"2000");
        selectVisible(month,"May");
        selectVisible(day,"19");



    }
}
