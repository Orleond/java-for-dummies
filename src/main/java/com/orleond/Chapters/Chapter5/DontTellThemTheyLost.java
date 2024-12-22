package com.orleond.Chapters.Chapter5;

import java.util.Random;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class DontTellThemTheyLost {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(in);

        out.print("Введите число от 1 до 10: ");

        int inputNumber = keyboard.nextInt();
        int randomNumber = new Random().nextInt(10) + 1;

        if (inputNumber == randomNumber) {
            out.println("Вы выиграли.*");
        }

        out.println("Прекрасная попытка :-");
        out.print("Случайное число равно ");
        out.println(randomNumber + ".");
        out.println("Спасибо за игру.");

        keyboard.close();
    }
}
