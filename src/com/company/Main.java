package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Гармонический ряд");
        double num = 1;
        double numm;
        for (int i = 1;i<=10;i++)
        {
            numm=num/i;
            System.out.printf("%.2f", numm);
            System.out.print(" ");
        }
    }
}
