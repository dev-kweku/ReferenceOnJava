import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner input=new Scanner(System.in);
    Account myAccount=new Account("TTU STUDENT",500.00);
        System.out.println("------WELCOME TO TTU ATM--------");

        boolean running=true;

        while(running){
            System.out.println("\n1. Check Balance | 2. Deposit | 3.Withdraw | 4. Exist");

            int choice=input.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Current Balance: $"+myAccount.getBalance());
                    break;
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double depositedAmount=input.nextDouble();
                    myAccount.deposit(depositedAmount);
                    break;
                case 3:
                    System.out.println("Enter withdrawal amount: ");
                    double withdrawalAmount=input.nextDouble();
                    myAccount.withdraw(withdrawalAmount);
                    break;
                case 4:
                    running=false;
                    System.out.println("Thanks you for using our ATM. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
        input.close();
    }
}