package com.orleond.Chapters.Chapter4;

public class Лифт2 {
    public static void main(String[] args) {
        System.out.println("Верно ли,");
        System.out.println("что лифт может поднять");
        System.out.println("десять человек?");
        System.out.println();

        int weightOfAPerson = 65;
        int elevatorWeightLimit = 635;
        int numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        boolean allTenOk = numberOfPeople >= 10;

        System.out.println(allTenOk);
    }
}
