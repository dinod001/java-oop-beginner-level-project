package userGui;

import java.util.Scanner;

public class Login {

    //User that already exist in bank, store there username and password
    String[] storedusername={"dinod","Ashen","Kaveesha","Heshan"};
    String[] storedpassword={"123","456","782","933"};

    //initializing credentials
    private static String username;
    private String Password;
    private Boolean loginSuccesful;

    Scanner scanner=new Scanner(System.in);

    public Login() {
        while (true){
            //get user input
            System.out.print("Enter Login username here: ");
            username=scanner.nextLine();
            System.out.print("Enter Login Password here: ");
            Password=scanner.nextLine();

            //call CheckCredentials method to check login credentials
            loginSuccesful=CheckCredentials(username,Password);

            //base on the CheckCredentials method show message
            if (loginSuccesful){
                System.out.println();
                System.out.println("****User Login Successful !****");
                System.out.println();
                break;
            }
            else{
                System.out.println();
                System.out.println("****User Login unsuccessful !****");
                System.out.println();
            }

        }
    }

    //Following method use to check whether user input true or not
    private Boolean CheckCredentials(String username,String password){
        for (int i=0;i<storedpassword.length;i++){
            if (storedusername[i].equals(username) && storedpassword[i].equals(Password)){
                return true;
            }
        }
        return false;
    }

    public static String getUsername() {
        return username;
    }
}
