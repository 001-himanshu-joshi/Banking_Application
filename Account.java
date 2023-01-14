package Banking_Application;

public class Account {
    public String AccountNumber;
    public String AccountName;
    public Integer PIN;
    public Double AccountBalance;
    public String PhoneNumber;


    public Account(String AccountNumber, String AccountName, Integer PIN, Double AccountBalance, String PhoneNumber){
        this.AccountNumber = AccountNumber;
        this.AccountName = AccountName;
        this.PIN = PIN;
        this.AccountBalance = AccountBalance;
        this.PhoneNumber = PhoneNumber;
    }

    public void CurrentAccountBalance(){
        System.out.println("Account Balance: " + this.AccountBalance);
    }

    public void AmountDeposited(Double Amount){
        this.AccountBalance += Amount;
        System.out.println("Amount is Successfully Deposited");
        System.out.println("Account Number: " + this.AccountNumber);
        System.out.println("Account Name: " + this.AccountName);
        System.out.println("Account Balance: " + this.AccountBalance);
    }

    public void AmountWithdrawal(Double Amount){
        if(this.AccountBalance - Amount < 0){
            System.out.println("Account Balance is Not Enough"); 
            System.out.println("Account Number: " + this.AccountNumber);
            System.out.println("Account Name: " + this.AccountName);
            System.out.println("Account Balance: " + this.AccountBalance);
        }else{
            this.AccountBalance -= Amount;
            System.out.println("Amount is Successfully Withdrawn");
            System.out.println("Account Number: " + this.AccountNumber);
            System.out.println("Account Name: " + this.AccountName);
            System.out.println("Account Balance: " + this.AccountBalance);
        }
    }

    
}
