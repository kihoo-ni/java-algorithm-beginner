package com.example;

import java.util.Scanner;

class P35Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("a값: ");
        int a = scanner.nextInt();

        System.out.println("b값: ");
        int b = scanner.nextInt();

        while (a > b) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.println("b값: ");
            b = scanner.nextInt();

        }
        System.out.println("b-a는 " + (b - a) + "입니다.");

    }

}
