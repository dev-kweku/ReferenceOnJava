import java.util.HashMap;
import java.util.Scanner;

public class UltraBankSystem {
    public static void main(String[] args){
        HashMap<Integer,Account> accountMap=new HashMap<>();
        Scanner input=new Scanner(System.in);

        accountMap.put(1001,new Account("Kofi",12000.00));
        accountMap.put(1002,new Account("Kweku",3000.00));
        accountMap.put(1003,new Account("Degraft",4000.00));

        System.out.println("-----TTU DIGITAL BANK-----");
        System.out.println("Enter your Account id: ");

        int id=input.nextInt();

        if(accountMap.containsKey(id)){
            Account user=accountMap.get(id);
            System.out.println("Login successfully, welcome, "+user.getOwner());
            System.out.println("Balance: GHS"+ user.getBalance());
        }else {
            System.out.println("Error: Account ID " + id + "does not exist.");
        }
    }
}
