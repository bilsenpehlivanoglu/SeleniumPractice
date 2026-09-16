package day12_faker_files;

import com.github.javafaker.Faker;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class C01_Faker {


    //faker objesi ile fake bir isim yazdirin
    //faker objesi ile fake bir soyisim yazdirin
    //faker objesi ile fake bir adress yazdirin
    //faker objesi ile fake bir telefon no yazdirin
    //faker objesi ile fake bir email yazdirin
    //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdirin
    //faker objesi ile fake bir isimsoyisim yazdirin


    @Test
    void fakerClassWork() {
        //faker objesi ile fake bir isim yazdirin
        Faker faker = new Faker();
        System.out.println(faker.name().firstName());

        //faker objesi ile fake bir soyisim yazdirin
        System.out.println(faker.name().lastName());

        //faker objesi ile fake bir adress yazdirin
        System.out.println(faker.address().fullAddress());

        //faker objesi ile fake bir telefon no yazdirin
        System.out.println(faker.phoneNumber().phoneNumber());

        //faker objesi ile fake bir email yazdirin
        System.out.println(faker.internet().emailAddress());

        //faker objesi ile fake bir rastgele 15 haneli bir sayi yazdirin
        System.out.println(faker.number().digits(15));

        //faker objesi ile fake bir isimsoyisim yazdirin
        System.out.println(faker.name().fullName());
    }

    @Test
    void test01() {
        /*
        belli bir bolgeye ozel fake bir data olusturmak istersek
         */
        Faker faker = new Faker(new Locale("ENG"));

        System.out.println(faker.name().fullName());
        System.out.println(faker.address().fullAddress());
    }
}
