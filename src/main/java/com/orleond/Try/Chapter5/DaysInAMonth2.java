package com.orleond.Try.Chapter5;

import java.util.Scanner;

public class DaysInAMonth2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String month = scanner.next().toLowerCase();

        switch (month) {
            case "январь", "март", "май", "июль",
                 "август", "октябрь", "декабрь":
                System.out.println("31 день");
                break;
            case "февраль":
                System.out.println("Год високосный? (да/нет): ");
                String answer = scanner.next().toLowerCase();
                if (answer.equals("да")) {
                    System.out.println("29 дней");
                } else if (answer.equals("нет")) {
                    System.out.println("28 дней");
                } else {
                    System.out.println("Неверный ввод");
                }
                break;
            case "апрель", "июнь", "сентябрь", "ноябрь":
                System.out.println("30 дней");
                break;
            default:
                System.out.println("Такого месяца не существует");

        }
    }
}
