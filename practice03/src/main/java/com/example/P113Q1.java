package com.example;

import java.util.Scanner;

public class P113Q1 {
    // --- 요솟수가 n인 배열 a에서 key와 값이 같은 요소를 보초법으로 선형 검색 ---//
    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key; // 보초를 추가

        System.out.printf("   |");
        for (int x = 0; x <= n; x++) {
            System.out.printf("%3d", x);
        }
        System.out.println();
        System.out.printf("---+");
        for (int y = 0; y <= n; y++) {
            System.out.printf("---");
        }
        System.out.println();
        for (i = 0; i <= n; i++) {

            System.out.printf("   |");
            for (int h = 0; h <= n; h++) {
                if (i == h) {
                    System.out.printf("  *");

                }
                System.out.printf("   ");
            }
            System.out.println();
            System.out.printf("%3d|", i);
            for (int z = 0; z <= n; z++) {
                System.out.printf("%3d", a[z]);
            }
            System.out.println();
            if (a[i] == key) {
                break;
            }
        }
        return i == n ? -1 : i;

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num + 1]; // 요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : "); // 키값을 읽력받음
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == -1)
            System.out.println("검색 값의 요소가 없습니다.");
        else
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
    }
}
