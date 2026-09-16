package day10_windowhandles_basicauthentication_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class AC_004 extends TestBase {

    @Test
    void test01() {
        //go to https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //drag me to my target webelement onto the drop here webelement
        //drag me to my target webelementini Drop here webelementi uzerine birakin
        driver.switchTo().frame(0);
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();

        //drag webelementinin drop uzerine birakildigini test edin
        WebElement dropped = driver.findElement(By.xpath("//p[.='Dropped!']"));
        Assertions.assertTrue(dropped.isEnabled());
    }
}
