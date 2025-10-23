package com.korit.study.ch24;

import java.util.concurrent.CopyOnWriteArrayList;

public class Comment {
    private String writer;
    private String content;


    //생성자 댓글을 만들 때 이름이랑 내용 초기화
    public Comment(String writer, String content) {
        this.writer = writer;
        this.content = content;
    }


    @Override
    public String toString() {
        return "Comment{" +
                "writer='" + writer +
                ", content='" + content +
                '}';
    }
}
