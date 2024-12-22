package com.orleond.Exercises.Chapter4;

public class Millionaire {
    public static void main(String[] args) {
        double amountInAccount;

        amountInAccount = 50.22;
        amountInAccount = amountInAccount + 1000000.00;

        System.out.print("На вашем счету сейчас ");
        System.out.print(amountInAccount);
        System.out.println(" долларов.");

        System.out.println("У вас появилось больше денег! " +
                           "Теперь на вашем счету " +
                           amountInAccount + " долларов");
    }
}
