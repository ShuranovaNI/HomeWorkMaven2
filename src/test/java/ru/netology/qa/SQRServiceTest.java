package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    public void TestingTheNumberOfSquares() {
        SQRService service = new SQRService();
        int actual = service.countSQR(200, 400);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWheMultipleRootsAreFound() {
        SQRService service = new SQRService();
        int actual = service.countSQR(9800, 9900);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestWhenNoRootsFound() {
        SQRService service = new SQRService();
        int actual = service.countSQR(0, 99);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWhenTheMinimumIsGreaterThanTheMaximumValue() {
        SQRService service = new SQRService();
        int actual = service.countSQR(400, 200);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void TestWhenRangeLimitsMatch() {
        SQRService service = new SQRService();
        int actual = service.countSQR(200, 200);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

}


