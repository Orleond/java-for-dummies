package com.orleond.Try.Chapter4;

public class Main {
    public static void main(String[] args) {
        int i = 10;
        System.out.println(i++);
        System.out.println(--i);
        --i;
        i--;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i--);
        System.out.println(i);
        i++;
        i = i++ + ++i;
        System.out.println(i);
        i = i++ + i++;
        System.out.println(i);
    }
}
