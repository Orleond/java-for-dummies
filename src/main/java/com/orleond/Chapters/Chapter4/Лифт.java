package com.orleond.Chapters.Chapter4;

public class Лифт {
    public static void main(String[] args) {
        int weightOfAPerson;
        int elevatorWeightLimit;
        int numberOfPeople;

        weightOfAPerson = 68;
        elevatorWeightLimit = 635;
        numberOfPeople = elevatorWeightLimit / weightOfAPerson;

        System.out.print("Лифт может поднять ");
        System.out.print(numberOfPeople);
        System.out.print(" человек.");
    }
}
