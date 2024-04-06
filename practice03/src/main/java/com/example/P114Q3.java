package com.example;

import java.util.Scanner;

public class P114Q3 {
    static int searchIdx(int[] x, int n, int key, int[] idx) {
        int i = 0;
        int idxCount = 0;
        for (i = 0; i < n; i++) {
            if (x[i] == key) {
                idx[idxCount++] = i;
            }

        }

        return idxCount;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num]; // 요솟수가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 값 : "); // 키값을 입력받음
        int ky = stdIn.nextInt();

        int[] index = new int[num];
        int idx = searchIdx(x, num, ky, index); // 배열 x에서 값이 ky인 요소를 검색

        if (idx == 0)
            System.out.println("그 값의 요소는 존재하지 않습니다.");
        else
            System.out.println("그 값은 총 " + idx + "개 있습니다.");
    }
}
