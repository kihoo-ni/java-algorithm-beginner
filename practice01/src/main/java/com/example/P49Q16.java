package com.example;

class P49Q16 {
    static void npira(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i - 1) * 2 + 1; k++) {
                System.out.print(i % 10);
            }
            System.err.println();
        }
    }

    public static void main(String[] args) {
        npira(4);
    }
}
