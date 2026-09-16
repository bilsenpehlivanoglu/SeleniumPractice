package day11_actions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C02_Actions extends TestBase {

    //go to https://www.amazon.com
    //go to the "Account & Lists" menu in the upper right section and click on the "Account" option
    //verify that the title of the opened page contains "Your Account"


    @Test
    void test01() {
        //go to https://www.amazon.com
        driver.get("https://www.amazon.com");

        //go to the "Account & Lists" menu in the upper right section and click on the "Account" option
        //sag ust bolumde bulunan "Account & Lists" menusune git "Account" secenegine tikla
        WebElement accountList = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Actions actions = new Actions(driver);
        actions.moveToElement(accountList).perform();

        driver.findElement(By.xpath("//span[.='Account']")).click();

        //verify that the title of the opened page contains "Your Account"
        //acilan sayfanin basliginin "Your Account" icerdigini dogrula
        Assertions.assertTrue(driver.getTitle().contains("Your Account"));




    }
}
