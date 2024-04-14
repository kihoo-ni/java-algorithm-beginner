package com.example;

public class NonRecurFac {
    public static int NonRecurFac(int num) {
        int multiSum = 1;
        for (int i = 1; i <= num; i++) {
            multiSum *= i;
        }
        return multiSum;
    }

    public static void main(String[] args) {
        System.out.println("5 팩토리얼 값은 " + NonRecurFac(5) + "입니다.");
    }
}
