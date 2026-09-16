package day12_faker_files;

import org.junit.jupiter.api.Test;

public class C03_FileExist {

    @Test
    void test01() {
        System.out.println(System.getProperty("user.dir"));    //user= kullanici, dir=directory demektir
        //current working directory i verir
        //Users/bilsen/IdeaProjects/SeleniumPractice

        System.out.println(System.getProperty("user.home"));//Users/bilsen

        String commonWay = "/IdeaProjects/SeleniumPractice";
    }
}
