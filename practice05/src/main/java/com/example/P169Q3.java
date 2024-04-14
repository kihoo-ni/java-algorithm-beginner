package com.example;

import java.util.Scanner;

public class P169Q3 {
    public static int gcdArray(int[] a) {
        int result = 0;
        if (a.length == 1) {
            return a[0];
        }
        for (int i = 0; i < a.length - 1; i++) {
            result = gcd(a[i], a[i + 1]);
            a[i + 1] = result;
        }
        return result;
    }

    public static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("배열의 길이를 지정하세요");
        int num = s.nextInt();

        int[] gcdArray = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("[" + i + "] : ");
            gcdArray[i] = s.nextInt();
        }

        System.out.println("배열의 최대공약수는 " + gcdArray(gcdArray) + "입니다.");
    }
}
