package com.example;

//YMD
public class P90Q8 {
    int y; // 년
    int m; // 월(1~12)
    int d; // 일(1~31)

    int monthDay[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    P90Q8(int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }

    P90Q8 after(int n) {
        P90Q8 ymd = new P90Q8(y, m, d);
        int monthNumCount = m;
        int totalDay = ymd.d + n;

        int yearNumCount = 0;

        while (totalDay > monthDay[monthNumCount]) {

            totalDay -= monthDay[monthNumCount];
            monthNumCount++;
            if (monthNumCount > 12) {
                monthNumCount %= 12;
                yearNumCount++;
            }
        }
        ymd.d = totalDay;

        if ((monthNumCount) % 12 != 0) {

            ymd.m = (monthNumCount) % 12;

        }
        ymd.y += yearNumCount;

        return ymd;
    }

    P90Q8 before(int n) {
        P90Q8 ymd = new P90Q8(y, m, d);

        int monthNumCount = m - 1;
        int residueDay = ymd.d - n;

        while (residueDay < 0) {

            residueDay += monthDay[monthNumCount];
            monthNumCount--;
            if (monthNumCount < 0) {
                monthNumCount = 12;
                ymd.y--;
            }
        }
        ymd.d = residueDay;

        ymd.m = monthNumCount + 1;

        return ymd;

    }

    public static void main(String[] args) {
        P90Q8 ymd1 = new P90Q8(2024, 4, 10);
        P90Q8 plusYmd = ymd1.after(365);
        P90Q8 minusYmd = ymd1.before(365);
        System.out.println(plusYmd.y + "년 " + plusYmd.m + "월 " + plusYmd.d + "일 ");
        System.out.println(minusYmd.y + "년 " + minusYmd.m + "월 " + minusYmd.d + "일 ");
    }
}
