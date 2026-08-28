package day09_iframe_windowhandles_basicauthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBase;

public class C01_Iframe extends TestBase {

    @Test
    void test01(){
       //https://testcenter.techproeducation.com/index.php?page=iframe
        driver.get("https://testcenter.techproeducation.com/index.php?page=iframe");

       //test that text "An iframe with a thin black border" on the home page contains "black border"
       //sayfadaki "An iframe with a thin black border" metninde "black border" oldugunu test edin
        String actualText = driver.findElement(By.xpath("//*[.'An iframe with a thin black border:']")).getText();
        Assertions.assertTrue(actualText.contains("black border"));

       //also test that the text "Applications lists " is on the page
       //also  "Applications lists " yazisinin sayfada oldugunu test edin
        WebElement applicationsLists = driver.findElement(By.xpath("//*[.='Applications lists']"));
        Assertions.assertTrue(applicationsLists.getText().contains("Applications lists"));

       //test that there is an iframe text in the page
       //sayfada iframe yazisinin oldugunu test edin
        WebElement iframeText = driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(iframeText.getText().contains("iframe"));
    }
}
