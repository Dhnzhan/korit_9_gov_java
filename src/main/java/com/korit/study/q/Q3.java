package com.korit.study.q;

import java.util.Arrays;

public class Q3 {
    public static void main(String[] args) {
//
////        Q1
//
//        int[] nums1 = new int[5];
//
//
//        for (int i = 0; i < nums1.length; i++) {
//            int sum = (i+1)*10;
//
//            nums1[i] = sum;
//
//            System.out.println(nums1[i]);
//        }
//
////        Q2
//
//        int[] nums2 = new int[5];
//        int result = 0;
//
//
//        for (int i = 0; i < nums2.length; i++) {
//            int sum = (i+1)*5;
//
//            nums2[i] = sum;
//
//
//            result += nums2[i];
//        }
//
//        System.out.println(result);
//
////        Q3
//
//        int[] nums3 = new int[] {23, 45, 12, 106, 34, 89, 99};
//
//        int result = nums3[0];
//
//        for (int i = 0; i < nums3.length; i++) {
//            if (nums3[i] > result) {
//                result = nums3[i];
//            }
//        }
//
//        System.out.println(result);
//
////        Q4
//
//        int[] nums4 = new int[10];
//
//        for (int i = 0; i < nums4.length; i++) {
//            nums4[i] = i + 1;
//
//            if (nums4[i] % 2 == 0) {
//                System.out.println(nums4[i]);
//            }
//    }
//
//        int[] evens = new int[0];
//
//        for (int i = 0; i < nums4.length; i++) {
//            if (nums4[i] % 2 == 0) {
//                int[] temp = new int[evens.length + 1];
//                for (int j = 0; j < evens.length; j++) {
//                    temp[j] = evens[j];
//                }
//                temp[temp.length - 1] = nums4[i]; // 배열의 제일 뒤쪽
//                evens = temp;
//
//                System.out.println(evens[evens.length - 1]);
//            }
//        }
//
////        Q5
//
//        int[] nums5 = new int[5];
//
//        for (int i = 0; i < nums5.length; i++) {
//            nums5[i] = i + 1;
//
//            System.out.println(6 - nums5[i]);
//        }
//
////        Q6

//        int[] nums6 = new int[] {3, 7, 3, 9, 3, 1, 3, 5};

//        int result = 0;
//
//        for (int i = 0; i < nums6.length; i++) {
//            if (nums6[i] == 3) {
//                result++;
//            }
//        }
//
//        System.out.printf("숫자 3의 개수 : %d개", result);
//
//        int[] arr1 = new int[0]; // 1들만 모으기
//        int[] arr2 = new int[0]; // 2들만 모으기
//        int[] arr3 = new int[0]; // 3들만 모으기
//
//        for (int i = 0; i < nums6.length; i++) {
//            if (nums6[i] == 1) {
//                int[] temp = new int[arr1.length + 1];
//                for (int j = 0; j < arr1.length; j++) {
//                    temp[j] = arr1[j];
//                }
//                temp[temp.length - 1] = nums6[i];
//                arr1 = temp;
//            } else if (nums6[i] == 2) {
//                int[] temp = new int[arr2.length + 1];
//                for (int j = 0; j < arr2.length; j++) {
//                    temp[j] = arr2[j];
//                }
//                temp[temp.length - 1] = nums6[i];
//                arr2 = temp;
//            } else if (nums6[i] == 3) {
//                int[] temp = new int[arr3.length + 1];
//                for (int j = 0; j < arr3.length; j++) {
//                    temp[j] = arr3[j];
//                }
//                temp[temp.length - 1] = nums6[i];
//                arr3 = temp;
//            }
//        }
//        System.out.println("1들: " + Arrays.toString(arr1));
//        System.out.println("2들: " + Arrays.toString(arr2));
//        System.out.println("3들: " + Arrays.toString(arr3));

////        Q7
//
//        int[] nums7 = new int[] {80, 90, 75, 85, 95};
//
//        int sum = 0;
//        double result = 0;
//
//        for (int i = 0; i < nums7.length; i++) {
//            sum += nums7[i];
//        }
//
//        result = sum/nums7.length;
//
//        System.out.println(result);
//
////        Q8
//
//        int[] num8 = new int[] {1, 2, 3, 4, 5};
//        int[] num9 = new int[] {6, 7, 8, 9, 10};
//        int[] num10 = new int[num8.length];
//
//        System.out.print("합 배열 : ");
//        for (int i = 0; i < num8.length; i++) {
//            num10[i] =  num8[i] + num9[i];
//            System.out.print(num10[i] + "\t");
//        }
//
////        Q9
//
//        int[] num11 = new int[]{45, 23, 67, 12, 89, 34, 78};
//
//        int min = num11[0];
//        int max = num11[0];
//
//        for (int i = 0; i < num11.length; i++) {
//            if (num11[i] > max) {
//                max = num11[i];
//            }
//            if (num11[i] < min) {
//                min = num11[i];
//            }
//        }
//
//        System.out.printf("최솟값 : %d\t 최댓값 : %d", min, max);
//
////        Q10
//
//        int[] num12 = new int[]{85, 92, 78, 96, 88, 73, 99, 82};
//
//        for (int i = 0; i < num12.length; i++) {
//            String score = null;
//
//            if (num12[i] > 89) {
//                score = "A";
//            } else if (num12[i] > 79) {
//                score = "B";
//            } else if (num12[i] > 69) {
//                score = "C";
//            } else {
//                score = "D";
//            }
//
//            System.out.printf("학생 %d : %d점 - %s등급" + System.lineSeparator(), i+1, num12[i], score);
//        }
//
//
    }
}
