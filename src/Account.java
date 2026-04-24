public class Account {
    private String owner;
    private double balance;

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
