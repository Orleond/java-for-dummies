package com.orleond.Chapters.Chapter5;

import java.util.Scanner;

import static java.lang.System.out;

public class FallingForYou {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Почему Эл стоит под дождем? Введите номер: ");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 3:
                out.print("Потому что дождь идет очень долго. ");
                out.println("Потому что дождь идет очень долго.");
            case 2:
                out.print("Потому что он очень расстроен. ");
                out.println("Потому что он очень расстроен.");
            case 1:
                out.print("Потому что он все-равно уже мокрый. ");
                out.println("Потому что он все-равно уже мокрый.");
        }

        out.println("Такой причины нет. Попытайтесь еще раз.");
        out.println("О-оооооооо...");
        out.println();

        keyboard.close();
    }
}
