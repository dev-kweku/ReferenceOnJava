public class SavingsAccount  extends Account{
    private double interestRate=0.05;

    public SavingsAccount(String owner,double initialBalance){
        super(owner,initialBalance);
    }

    public void applyInterest(){
        double interest=getBalance()*interestRate;
        deposit(interest);
        System.out.println("Interest applied: GH" + interest);
    }

    public void withdraw(double amount){
        if(amount>2000){
            System.out.println("Savings limit exceeded! You can only withdraw GH:2000 at a time");
        }else{
            super.withdraw(amount);
        }
    }
}
