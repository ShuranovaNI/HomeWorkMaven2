package ru.netology.qa;

public class SQRService {
    public int countSQR(int lowerBound, int upperBound) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            int square = i * i;
            if (square >= lowerBound && square <= upperBound) {
                count = count + 1;
            } else if (square > upperBound) {
                break;
            }
        }
        return count;
    }
}
