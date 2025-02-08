package org.example.exersice_2_controll_flow;

public class ControlFlow {

    public static void RepeatHello(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Repetition: " + i + " Hello, World!");
        }
    }

    // Default values for method signatures are NOT SUPPORTED in Java
    public static void DoWhile(int n) {
        int i = 0;
        do {
            System.out.println("Repetition: " + i + " Hello, World!");
            i++;
        } while (i < n);
    }

    public static void IfElse(int n_oranges) {
        int applePrice = 3;
        int orangePrice = 2;
        int allowance = 50;

        // Verify if you can buy n apples and 2 oranges

        int groceryBill = n_oranges * applePrice + 2 * orangePrice;
        if (groceryBill < allowance || groceryBill == allowance) {
            System.out.println("I can buy what I need! Cost: " + groceryBill + " Allowance: " + allowance);
        } else {
            System.out.println("Not this time :/ ");
        }

    }

}


