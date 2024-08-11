package userGui;

import java.util.Scanner;

public class MainMenu {
    public MainMenu() {
        int userchoice;
        Scanner scanner=new Scanner(System.in);

        while (true){
            //Main menu of the ATM

            System.out.println();
            System.out.println("\t\t\t*******Welcome to ABC Bank*******");
            System.out.println();
            System.out.println("1. Display account details");
            System.out.println("2. Check balance");
            System.out.println("3. Withdraw money");
            System.out.println("4. Deposit Money");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter user input here: ");
            userchoice=scanner.nextInt();
            scanner.nextLine();

            CallToOptions(userchoice);
        }
    }
    // according to the user input call to relevant class
    private void CallToOptions(int userchoice){
        switch (userchoice){
            case 1:
                DisplayAccountDetails displayAccountDetails=new DisplayAccountDetails();
                break;
            case 2:
                Account.checkBalance();;
                break;
            case 3:
                Scanner scanner=new Scanner(System.in);
                Account.withdrawMoney(scanner);
                break;
            case 4:
               Scanner scanner1=new Scanner(System.in);
                Account.depositMoney(scanner1);
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println();
                System.out.println("!!!!Please choose valid option!!!!");
        }

    }
}
