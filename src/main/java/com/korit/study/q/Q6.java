package com.korit.study.q;

import java.util.Arrays;

public class Q6 {
    public static void main(String[] args) {

        int[][] nums = { {1, 2, 3},{4, 5, 6},{7, 8, 9} };

        System.out.println(nums[1][1]);

        int nums2 = new int[][] { {1, 2, 3},{4, 5, 6},{7, 8, 9} }[1][1];
        System.out.println(nums2);

        int[] nums3 = new int[][] { {1, 2, 3},{4, 5, 6},{7, 8, 9} }[1];
        System.out.println(Arrays.toString(nums3));

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
