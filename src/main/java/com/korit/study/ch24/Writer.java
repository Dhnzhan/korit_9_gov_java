package com.korit.study.ch24;

import com.korit.study.ch22.entity.User;


//게시글, 댓글 작성자 정보를 담는 객체
public class Writer {
    private String name;
    private int age;
    //이름 나이 초기화

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //tostring
    @Override
    public String toString() {
        return "Writer{" +
                "name='" + name +
                ", age=" + age +
                '}';
    }
}

