package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        ComplexNunber number1 = new ComplexNunber(1, 4);
        ComplexNunber number2 = new ComplexNunber(4, 7);
        ComplexNunber sum = number1.sum(number2);
        ComplexNunber multiplication = number2.multiplication(number1);
    }
}
