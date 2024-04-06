package com.example;

import java.util.Scanner;

public class P115Q5 {
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        while (pl <= pr) {
            int pc = (pl + pr) / 2;

            if (a[pc] == key) {
                for (int i = pl; i < pc; i++) {
                    if (a[i] == key) {
                        return i;
                    }
                }
                return pc;

            }

            if (a[pc] < key) {
                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소수 : ");
        int digitNum = scanner.nextInt();

        int binSearchArr[] = new int[digitNum];

        for (int i = 0; i < binSearchArr.length; i++) {
            System.out.print(i + "번째 값 : ");
            binSearchArr[i] = scanner.nextInt();
        }

        System.out.print("찾고자하는 값 : ");
        int key = scanner.nextInt();

        int detectIndex = binSearchX(binSearchArr, digitNum, key);

        System.out.println(key + "의 위치는 binSearchArr[" + detectIndex + "] 입니다.");
    }
}
