package com.korit.study.ch24;

import java.util.List;

public class Board {
    private String title;
    private String content;
    private Writer writer;
    private List<Comment> comments;

    public Board(String title, String content, Writer writer, List<Comment> comments) {
        this.title = title;
        this.content = content;
        this.writer = writer;
        this.comments = comments;
    }


    @Override
    public String toString() {
        return "Board{" +
                "title='" + title +
                ", content='" + content +
                ", writer=" + writer +
                ", comments=" + comments +
                '}';
    }

}
