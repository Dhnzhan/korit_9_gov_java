package com.korit.study.q;

class ConstructorStudy {
    String data1;
    int data2;
    double data3;

    // 매개변수인자 - Arguments

    // 매개변수가 없는 생성자 - NoArgsConstructor
    ConstructorStudy() {}

    // 필수값을 모두 받는 생성자 - RequiredArgsConstructor
    ConstructorStudy(String data1, int data2, double data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;

    }
}


public class 생성자정리 {
    public static void main(String[] args) {

    }
}
