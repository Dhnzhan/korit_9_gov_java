package com.korit.study.ch23;


import java.util.Objects;

public class GenericMain {

    public static void main(String[] args) {
        NonGeneric a = new NonGeneric("문자열 데이터");
        NonGeneric b = new NonGeneric(10);
        NonGeneric c = new NonGeneric(new NonGeneric(null));
        NonGeneric d = new NonGeneric(a);
        NonGeneric[] arr = {a, b, c, d};

        for (NonGeneric n : arr) {
            System.out.println(n.getData().getClass());
            if (n.getData() instanceof String data) {
//                String data = (String) n.getData();
                System.out.println(data);
            } else if (n.getData() instanceof NonGeneric data) {
                System.out.println(data.getData());
            }
        }

        // <> 으로 안에 타입을 명시해주지 않으면 object가 된다
        // 꺽새 안을 비워두기
        Generic<String, Integer> e = new Generic<String, Integer>("문자열 데이터", "", 3.14, 10);

        // int, Integer
        Generic<String, Integer> f = new Generic<>("문자열 데이터", "", 3.14, 10);
//        e.getData()

        Objects[] err2 = new Objects[1];

    }

}