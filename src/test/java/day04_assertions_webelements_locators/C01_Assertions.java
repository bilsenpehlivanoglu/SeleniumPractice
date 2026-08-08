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
}
