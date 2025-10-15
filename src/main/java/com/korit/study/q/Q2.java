package com.korit.study.q;

public class Q2 {
    public static void main(String[] args) {

        int nums1 [] = new int[5];

        for (int i = 0; i < 5; i++) {
            int num = (i + 1) * 10;
            nums1[i] = num;
            System.out.println(nums1[i]);
        }

        int nums2 [] = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            int num = (i + 1) * 5;

            nums2[i] = num;

            sum += nums2[i];
        }
        System.out.println(sum);



    }
}
