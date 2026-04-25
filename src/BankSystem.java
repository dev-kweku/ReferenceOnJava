import java.util.ArrayList;
import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args){
        ArrayList<Account> database=new ArrayList<>();

        Scanner input=new Scanner(System.in);

//        adding data to the database using ArrayList
        database.add(new Account("frimpong",1000.00));
        database.add(new Account("degraft",3000.00));
        database.add(new Account("kweku",5000.00));

        System.out.println("Enter the account name to login");
        String searchName=input.nextLine();

        Account foundAccount=null;
        for(Account acc:database){
            if(Boolean.parseBoolean(String.valueOf(acc.getOwner().equalsIgnoreCase(searchName)))){
                foundAccount=acc;
                break;

            }
        }

        if(foundAccount!=null){
            System.out.println("Welcome back, "+ foundAccount.getOwner());
            System.out.println("your balance is GHS "+ foundAccount.getBalance());
        }else {
            System.out.println("Account not found in the Takoradi databases");
        }
    }
}
