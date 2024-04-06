package com.example;

import java.util.Scanner;

public class P114Q4 {
    static int binSearch(int[] list, int listLength, int key) {
        int pl = 0;
        int pr = listLength - 1;

        System.out.printf("   |");
        for (int x = 0; x < listLength; x++) {
            System.out.printf("%3d", x);
        }
        System.out.println();
        System.out.printf("---+");
        for (int y = 0; y < listLength; y++) {
            System.out.printf("---");
        }
        System.out.println();
        while (pl <= pr) {

            int pc = (pl + pr) / 2;

            System.out.printf("   |");

            System.out.printf(String.format("%%%ds<-", pl * 3 + 1), "");
            System.out.printf(String.format("%%%ds+", 2 * (pc - pl) + 1), "");
            System.out.printf(String.format("%%%ds->", 2 * (pr - pc) + 1), "");

            System.out.println();

            System.out.printf("%3d|", pc);
            for (int i = 0; i < listLength; i++) {
                System.out.printf("%3d", list[i]);
            }
            System.out.println();

            if (list[pc] == key) {
                return pc;
            }
            if (list[pc] < key) {

                pl = pc + 1;
            } else {
                pr = pc - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("요소 숫자를 입력하세요(오름차순으로 입력할 것) : ");
        int digitNum = scanner.nextInt();

        int[] list = new int[digitNum];

        for (int i = 0; i < list.length; i++) {
            System.out.print("list[" + i + "]: ");
            list[i] = scanner.nextInt();
        }

        System.out.print("찾고 싶은 숫자를 입력하세요 : ");
        int key = scanner.nextInt();

        int resultNum = binSearch(list, digitNum, key);

        if (resultNum == -1) {
            System.out.println("찾는 값이 없습니다.");
        } else {
            System.out.println(key + "은 list[" + resultNum + "]에 있습니다");
        }

    }
}
