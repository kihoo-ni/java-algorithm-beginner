package com.example;

import java.util.Arrays;
import java.util.Scanner;

public class P68Q2 {
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            swap(arr, i, arr.length - i - 1);
            System.out.println(Arrays.toString(arr));
            System.out.println("arr[" + i + "]과 " + "arr[" + (arr.length - i - 1) + "]을 교환합니다.");

            if (i == arr.length / 2 - 1) {
                System.out.println("역순 정렬 완료");
            }
        }
    }

    static int sumOf(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void copy(int[] a, int[] b) {
        int len = b.length;
        if (a.length < b.length) {
            len = a.length;
        }
        for (int i = 0; i < len; i++) {
            a[i] = b[i];
        }
    }

    static void rcopy(int[] a, int[] b) {
        int len = b.length;
        if (a.length < b.length) {
            len = a.length;
        }
        for (int i = 0; i < len; i++) {
            a[i] = b[b.length - i - 1];
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("arr배열의 길이: ");

        int arrLength = scanner.nextInt();

        int[] arr = new int[arrLength];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + "번째 배열 값: ");
            arr[i] = scanner.nextInt();
            System.out.println();
        }

        // reverse(arr);

        // System.out.println("배열의 총합: " + sumOf(arr));

        System.out.print("arr1 배열의 길이: ");

        int arrLength1 = scanner.nextInt();

        int[] arr1 = new int[arrLength1];

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(i + "번째 배열 값: ");
            arr1[i] = scanner.nextInt();
            System.out.println();
        }

        // copy(arr, arr1);

        // System.out.println("arr1의 배열요소를 arr에 copy");
        // for (int i = 0; i < arr.length; i++) {
        // System.out.println("arr[" + i + "]= " + arr[i]);
        // }
        rcopy(arr, arr1);

        System.out.println("arr1의 배열요소를 arr에 역순으로 copy");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]= " + arr[i]);
        }
    }
}
