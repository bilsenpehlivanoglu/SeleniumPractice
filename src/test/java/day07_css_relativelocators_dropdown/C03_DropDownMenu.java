package day07_css_relativelocators_dropdown;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class C03_DropDownMenu {

    /* DropDown:

     DropDown u automate etmek icin
     1) DropDown menuyu locate ederiz
     2) Select objecti olusturulur
     3) Select objecti uzerinden cesitli methodlar ile seceneklere erisim saglariz

     Syntax:
     Select options = new Select(Webelement dropdown); ->bu bir constructor

     a) selectbyvisibletext() ->gorunur text kullanilir
     b) selectbyindex() ->index kullanilir (index 0 dan baslar)
     c) selectbyvalue() ->value attribute degeri kullanilir

     4) getOptions() -> locate ettigimiz dropdown menudeki tum secenekleri verir.
     5) getfirstselectedoption() ->ilk secili olan secenegi verir.

     */



    //https://testcenter.techproeducation.com/index.php?page=dropdown

    //https://testcenter.techproeducation.com/index.php?page=dropdown
    //3 farkli method olusturun
    //1.method:
    //  a)yil,ay,gun dropdown menuleri locate edin
    //  b)select objesi olustur
    //  c)select objecti kullanarak 3 farkli sekilde secim yap
    //2)method:
    //  a)tum eyalet isimlerini yazdirin
    //3.method:
    //  a)state dropdown daki varsayilan secili secenegin "Select a State" oldugunu verify yapalim

    WebDriver driver ;

    @BeforeEach
    void setUp() {
        driver  = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");
    }

    @Test
    void test01() {
        //1.method:
        //  a)yil,ay,gun dropdown menuleri locate edin
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        //  b)select objesi olustur
        Select selectYear = new Select(year);
        Select selectMonth = new Select(month);
        Select selectDay = new Select(day);

        //  c)select objecti kullanarak 3 farkli sekilde secim yap
        selectYear.selectByIndex(0);//index ler 0 dan baslar, bu birinci element demektir
        selectMonth.selectByValue("4");//option value"4">May
        selectDay.selectByVisibleText("15");//ekranda gorulen text e gore secilir

    }

    @Test
    void test02() {
        //2)method:
        //  a)tum eyalet isimlerini yazdirin
        WebElement states = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(states);
        List<WebElement> stateList = select.getOptions();

        //first way
//        for (WebElement w:stateList){
//            System.out.println(w.getText());
//        }

        //second way
        stateList.forEach(t-> System.out.println(t.getText()));
    }

    @Test
    void test03() {
        //yil,ay,gun dropdown menuleri locate ediniz
        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        year.sendKeys("2021");
        month.sendKeys("May");
        day.sendKeys("19");

    }

    @Test
    void test04() {
        //3.method:
        //  a)state dropdown daki varsayilan secili secenegin "Select a State" oldugunu verify yapalim
        WebElement states = driver.findElement(By.cssSelector("#state"));
        Select select = new Select(states);
        String actualOption = select.getFirstSelectedOption().getText();
        String expectedOption = "Select a State";
        Assertions.assertEquals(expectedOption,actualOption);
    }

    @AfterEach
    void tearDown() {
    driver.quit();
    }
}
