package day11_actions;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

public class C04_Actions extends TestBase {

    //go to https://jqueryui.com/droppable/
    //drag me to my target webelement onto the drop here webelement
    //drag me to my target webelementini Drop here webelementi uzerine birakin

    //drag webelementinin drop uzerine birakildigini test edin


    @Test
    void test01() {
        //go to https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //drag me to my target webelement onto the drop here webelement
        //drag me to my target webelementini Drop here webelementi uzerine birakin
        driver.switchTo().frame(0);//indexler 0 dan baslar
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();//darg webelementini drog webelementinin uzerine birakir

    }

    @Test
    void test02() { //uzun yoldan cozumu
        //go to https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //drag me to my target webelement onto the drop here webelement
        //drag me to my target webelementini Drop here webelementi uzerine birakin
        driver.switchTo().frame(0);//indexler 0 dan baslar
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag) //elemente tiklar ve basili tutar
                .moveToElement(drop) //drop elementi uzerine goturur
                .release() //elementi birakir
                .perform();


    }

    @Test
    void test03() { //uzun yoldan cozumu
        //go to https://jqueryui.com/droppable/
        driver.get("https://jqueryui.com/droppable/");

        //drag me to my target webelement onto the drop here webelement
        //drag me to my target webelementini Drop here webelementi uzerine birakin
        driver.switchTo().frame(0);//indexler 0 dan baslar
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).
                moveByOffset(137,52)//konum belirtiyoruz
                .release().perform();



    }



}
