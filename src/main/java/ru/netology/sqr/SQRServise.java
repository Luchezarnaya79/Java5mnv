package ru.netology.sqr;

public class SQRServise {

    public int calculateSQR(int maxD, int minD) {
        int quantity = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minD) {
                if (i * i <= maxD) {
                    quantity++;
                }
            }
        }
        return quantity;
    }


}
