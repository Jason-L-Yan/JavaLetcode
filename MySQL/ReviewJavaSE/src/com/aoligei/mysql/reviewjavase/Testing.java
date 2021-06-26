package com.aoligei.mysql.reviewjavase;

public class Testing {
    public static void main(String[] args) {
        ILike like = (String name) -> {
            System.out.println("i like " + name);
        };
        like.like("lambda");
    }
}

interface ILike{
    void like(String name);
}