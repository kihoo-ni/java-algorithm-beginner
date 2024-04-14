package com.example;

import java.util.Scanner;

public class P169Q02 {

    public static int gcd(int x, int y) {
        int r = 0;

        if (x < y) {
            int temp = x;
            x = y;
            y = temp;
        }

        for (;;) {
            if (x % y == 0) {
                return y;
            } else {
                r = x % y;
                x = y;
                y = r;
            }

        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a + "와 " + b + "의 최대공약수는 " + gcd(a, b) + "입니다.");
    }
}
