package com.korit.study.ch24;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //1. 작성자 객체 만들기
        //2. 댓글 리스트 만들기
        //3. 게시글 객체 만들기
        //4. 게시글 리스트 만들기
        //5. 게시글 하나씩 출력하기

        Writer writer1 = new Writer("김준일", 32);
        Writer writer2 = new Writer("김준사", 34);

        List<Comment> comments1 = new ArrayList<>();
        comments1.add(new Comment("김준이", "댓글내용1"));
        comments1.add(new Comment("김준삼", "댓글내용2"));

        List<Comment> comments2 = new ArrayList<>();
        comments2.add(new Comment("김준오", "댓글내용11"));
        comments2.add(new Comment("김준육", "댓글내용22"));

        Board board1 = new Board("게시판 제목1", "게시판 내용1", writer1, comments1);
        Board board2 = new Board("게시판 제목2", "게시판 내용2", writer2, comments2);

        List<Board> boardList = new ArrayList<>();
        boardList.add(board1);
        boardList.add(board2);

        for (Board board : boardList) {
            System.out.println(board);
        }
    }
}
