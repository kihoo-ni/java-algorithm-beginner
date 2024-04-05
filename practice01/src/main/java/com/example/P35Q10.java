package com.example;

import java.util.Scanner;

class P35Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("양의 정수를 입력하세요");
        int plusEssence = scanner.nextInt();

        int digitnum = 0;
        while (plusEssence > 0) {
            plusEssence /= 10;
            digitnum++;
        }
        System.out.println("그 수는 " + digitnum + "자리입니다.");
    }
}
