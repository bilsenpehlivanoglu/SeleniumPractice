package day13_robot_seleniumwaits;

import org.junit.jupiter.api.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C01_Robot {

    @Test
    void test01() throws AWTException {

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);//3 saniye bekler
    }
}
