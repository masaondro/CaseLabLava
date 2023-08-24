package org.example;

public class Main {
    private static int a = 4;
    private  static int b = 5;
    public static void main(String[] args) {
        System.out.println("Начальные значения. a = " + a + " b = " + b);
        swapValuesArithmetic();
        System.out.println("После смены арифметическим методом. a = " + a + " b = " + b);
        swapValuesBitOperations();
        System.out.println("После смены с помощью битовых операций. a = " + a + " b = " + b);
    }

    private static void swapValuesArithmetic() {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    private static void swapValuesBitOperations() {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}