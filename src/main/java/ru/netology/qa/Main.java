package ru.netology.qa;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int lowerBound = 200;
        int upperBound = 400;

        int result = service.countSQR(lowerBound, upperBound);

        System.out.println(result);


    }
}