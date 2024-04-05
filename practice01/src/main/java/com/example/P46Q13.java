package com.example;

import java.util.Scanner;

class P46Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        int racLength = scanner.nextInt();
        System.out.printf("변의 길이: %d%n", racLength);
        for (int i = 0; i < racLength; i++) {

            System.out.println("*".repeat(racLength));
        }
    }
}
