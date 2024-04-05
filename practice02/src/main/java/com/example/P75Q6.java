package com.example;

import java.util.Scanner;

public class P75Q6 {
    // 정수 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수(역순해서)를 반환
    static int convertNum(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.printf("%2d| %10d%n", r, x);
        System.out.printf("  + -----------%n");
        while (x > 0) {
            d[digits++] = dchar.charAt(x % r);
            if (x / r != 0) {

                System.out.printf("%2d| %10d ... %d%n", r, x / r, x % r);
            } else {
                System.out.printf("  | %10d ... %d%n", x / r, x % r);
            }
            System.out.printf("  + -----------%n");
            x /= r;

        }

        for (int i = 0; i < digits / 2; i++) {
            char temp = d[i];
            d[i] = d[digits - 1 - i];
            d[digits - 1 - i] = temp;
        }

        return digits;
    }

    public static void main(String[] args) {
        char[] digitsArr = new char[32];

        Scanner scanner = new Scanner(System.in);

        System.out.println("10진수를 기수 변환합니다.");
        System.out.print("변환하는 음이아닌 정수 : ");

        int pInteger = scanner.nextInt();

        System.out.print("어떤 진수로 변환 할까요? (2~36) : ");

        int baseNum = scanner.nextInt();

        int dno = convertNum(pInteger, baseNum, digitsArr);

        System.out.println(baseNum + "진수로 ");
        for (int i = 0; i < dno; i++) {
            System.out.print(digitsArr[i]);
        }
        System.out.println("입니다.");
    }
}
