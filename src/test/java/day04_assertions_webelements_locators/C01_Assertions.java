package day04_assertions_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class C01_Assertions {
    
    /*
    Junit4 de assertion yapmak icin assert class kullaniliyordu
    Junit5 de assertion yapmak icin Assertions class kullanilir
     */

    @Test
    void test01() {
        String expectedData = "Junit 4";
        String actualData = "Junit 4";
        Assertions.assertEquals(expectedData,actualData);
    }

    @Test
    void test02() {
        Assertions.assertTrue(3<5);
    }

    @Test
    void test03(){
        Assertions.assertFalse("selenium".contains("E"));//pass
    }

    @Test
    void test04() {
        Assertions.assertNotEquals("selenium","junit");//pass
    }

    @Test
    void test05() {
        char [] expectedArray = {'j','u','n','i','t'};
        char [] actualArray = {'J','u','n','i','t'};
        Assertions.assertArrayEquals(expectedArray,actualArray);//fail
        //iki arrayin esit olabilmesi icin ayni indexte ayni eleman olmasi gerekir.
    }

    @Test
    void test06() {
        String str = null;
        Assertions.assertNull(str);
    }

    @Test
    void test07() {
        String str = "junit";
        Assertions.assertNotNull(str);//pass
    }
}
