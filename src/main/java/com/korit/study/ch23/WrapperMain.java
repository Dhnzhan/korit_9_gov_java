package com.korit.study.ch23;

import java.util.ArrayList;

public class WrapperMain {
    public static void main(String[] args) {
        int num = 10;
        Integer num2 = 10; // autoBoxing
//        Integer num3 = new Integer(10);
        // 일반 자료형을 참조 자료형태로 매핑하기

        int num4 = num2;    //aotoUnBoxing
        String numStr = Integer.toString(num);
        String numStr2 = "" + num;
        String numStr3 = num2.toString();



    }
}