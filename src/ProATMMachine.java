import java.util.InputMismatchException;
import java.util.Scanner;

public class ProATMMachine {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        Account myaccount=new Account("TTU Student",1000.00);
        int secretPin=1234;
        int attempt=0;
        boolean authenticated=false;

        System.out.println("-----TTU SECURE BANKING------");
        while(attempt<3 && !authenticated){
            System.out.println("Enter your 4-digit PIN: ");

            try{
                int enteredPin=input.nextInt();
                if(enteredPin==secretPin){
                    authenticated=true;
                }else{
                    attempt++;
                    System.out.println("Incorrect Pin attempt left :" +(3-attempt));
                }


            }catch(InputMismatchException e){
                System.out.println("Error: Please enter numbers only");
            }

        }
        if(!authenticated){
            System.out.println("Card is blocked. please visit the nearest bank branch at Takoradi");
            return;
        }

        boolean running=true;
        while(running){
            try{
                System.out.println("\n1. Balance | 2. Deposit | 3. Withdraw | 4. Exit");
                System.out.print("Selection: ");
                int choice=input.nextInt();


                switch(choice){
                    case 1-> System.out.println("Balance: GH " +myaccount.getBalance());
                    case 2->{
                        System.out.println("Amount to deposit: ");
                        myaccount.deposit(input.nextDouble());
                    }
                    case 3->{
                        System.out.println("Amount to withdraw: ");
                        myaccount.withdraw(input.nextDouble());
                    }
                    case 4->{
                        running=false;
                        System.out.println("Session ended. Take your card. ");
                    }

                    default -> System.out.println("Invalid option...");
                }
            }catch(InputMismatchException e){
                System.out.println("Critical Error: Invalid keyboard input detected!");
                input.next();

            }
            input.close();
        }



    }
}
