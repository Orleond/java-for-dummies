package com.orleond.Chapters.Chapter5;

import java.util.Scanner;

import static java.lang.System.out;

public class JustSwitchIt {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Почему Эл стоит под дождем? Введите номер: ");
        int verse = keyboard.nextInt();

        switch (verse) {
            case 1:
                out.println("Потому что дождь идет очень долго.");
                break;
            case 2:
                out.println("Потому что он очень расстроен.");
                break;
            case 3:
                out.println("Потому что он все-равно уже мокрый.");
                break;
            default:
                out.println("Такой причины нет. Попытайтесь еще раз.");
                break;
        }

        out.println("О-оооооооо...");

        keyboard.close();
    }
}
