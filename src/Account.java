public class Account implements TransactionProtocol {
    private String owner;
    private double balance;

    public void printReceipt(){
        System.out.println("Printing receipt for " + owner);
    }

    @Override
    public void logTransaction(String type) {
        System.out.println("Transaction Logged: "+ type);

    }

//    public void logTransaction(){
//
//    }

    public Account(String owner,double initialBalance){
        this.owner=owner;
        this.balance=initialBalance;
    }

    public double getBalance(){
        return  balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Successfully deposited: $ "+amount);
        }else{
            System.out.println("Invalid deposit amount. ");
        }
    }

    public void withdraw(double amount){
        if(amount>0 && amount <= balance){
            balance-=amount;
            System.out.println("Successfully withdrawn: $" + amount);
        }else if(amount > balance){
            System.out.println("Insufficient funds! You only have: $"+ balance);
        }else{
            System.out.println("Invalid withdrawal amount");
        }


    }
}
