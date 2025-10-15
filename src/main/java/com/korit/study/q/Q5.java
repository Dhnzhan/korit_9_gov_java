package com.korit.study.q;

public class Q5 {
    public static void main(String[] args) {
        int[] 기본급 = {10000, 20000, 30000};
        double 세율 = 0.15;
        int[] 지급액 = new int[3];

        for (int i = 0; i < 기본급.length; i++) {
            지급액[i] = 기본급[i] - (int)(기본급[i] * 세율);
        }
        for (int i = 0; i < 지급액.length; i++) {
            System.out.println(지급액[i]);
        }
    }
}
