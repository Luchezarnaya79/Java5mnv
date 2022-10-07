package ru.netology.sqr;

public class Main {
    public static void main(String[] args) {

            SQRServise sqrServise = new SQRServise();
            int bonus = sqrServise.calculateSQR(700, 200);
            System.out.println("Количество попаданий в диапазон =" + bonus);




    }
}