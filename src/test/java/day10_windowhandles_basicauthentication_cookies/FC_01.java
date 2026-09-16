package day10_windowhandles_basicauthentication_cookies;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import utilities.TestBase;

public class FC_01 {

    @Test
    void test01() {
        Faker faker = new Faker();

        //faker objesi ile fake bir isim yazdirin
        System.out.println(faker.name().firstName());

        //faker objesi ile fake bir soyisim yazdirin
        System.out.println(faker.name().lastName());

        //faker objesi ile fake bir adress yazdirin
        System.out.println(faker.address().fullAddress());

        //faker objesi ile fake bir telefon no yazdirin
        System.out.println(faker.phoneNumber());

        //faker objesi ile fake bir email yazdirin
        System.out.println(faker.internet().emailAddress());

        //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdirin
        System.out.println(faker.number().digits(15));

        //faker objesi ile fake bir isimsoyisim yazdirin
        System.out.println(faker.name().fullName());

    }
}
