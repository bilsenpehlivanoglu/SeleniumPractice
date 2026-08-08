package day03_implicitlywait_junit;

import org.junit.jupiter.api.*;

public class C03_BeforeAfter {

    @BeforeAll
    static void beforeAll() {
        System.out.println(" @BeforeAll tum test methodlarindan once 1 kere calisir");
    }

    @BeforeEach
    void setUp() {
        System.out.println("@BeforeEach her bir test methodlarindan once 1 kere calisir");
    }

    @Test
    void test01() {
        System.out.println("test01 calisti");
    }
    @Test @Disabled
    void test02() {
        System.out.println("test02 calisti");
    }
    @Test
    void test03() {
        System.out.println("test03 calisti");
    }

    @AfterEach
    void tearDown() {

    }

    @AfterAll
    static void afterAll() {

    }
}
