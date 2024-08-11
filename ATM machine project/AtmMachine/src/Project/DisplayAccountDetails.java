package userGui;

public class DisplayAccountDetails {
    private String username;

    public  DisplayAccountDetails() {
        username=Login.getUsername();//get user name from the login class
        System.out.println("------Here is your details------");
        System.out.print("your name is "+username);
        Account.checkBalance();
        System.out.println();
    }
}
