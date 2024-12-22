package com.orleond.Chapters.Chapter5;

import java.util.Scanner;

import static java.lang.System.out;

public class Authenticator2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        out.print("Имя пользователя: ");
        String username = keyboard.next();

        if (username.equals("bburd")) {
            out.print("Пароль: ");
            String password = keyboard.next();

            if (password.equals("swordfish")) {
                out.println("Вы в системе");
            } else {
                out.println("Неправильный пароль");
            }
        } else {
            out.println("Неизвестный пользователь");
        }

        keyboard.close();
    }
}
