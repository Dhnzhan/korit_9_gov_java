package com.korit.study.q;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int randomNum = (int)(Math.random() * 100) + 1;
        int userNum = 0;

        System.out.println(randomNum);

        while (randomNum != userNum) {
            System.out.println("숫자를 입력하세요");
            userNum = scanner.nextInt();

            if(userNum > randomNum) {
                System.out.println("down");
            } else if (userNum < randomNum){
                System.out.println("up");
            } else {
                System.out.println("정답입니다!");
            }
        }
    }
}
