package userGui;

import java.util.Scanner;

public class Account {
    private static float currentBalance=0;
    Scanner scanner=new Scanner(System.in);

    public static void checkBalance() {
        System.out.print("\nCurrent balance is $" + currentBalance);
        System.out.println();
    }

    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > currentBalance) {
            System.out.println("Insufficient funds.");
        } else {
            currentBalance -= amount;
            System.out.println("Money withdrawn successfully.");
        }
    }

    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: $");
        double amount = scanner.nextDouble();
        currentBalance += amount;
        System.out.println("Money deposited successfully.");
    }
}
