package com.example;

class P49Q15 {
    static void spira(int n) {
        int lastNum = (n - 1) * 2 + 1;

        for (int i = 0; i < n; i++) {
            for (int k = 0; k < lastNum / 2 - i; k++) {
                System.out.print(" ");
            }

            for (int k = lastNum / 2 - i; k <= lastNum / 2 + i; k++) {
                System.out.print("*");
            }

            for (int k = lastNum / 2 + i; k < lastNum; k++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        spira(5);
    }
}
