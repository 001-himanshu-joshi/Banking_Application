package Banking_Application;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String AccountNumber = sc.next();
        sc.nextLine();
        String AccountName = sc.nextLine();
        Double AccountBalance = sc.nextDouble();
        Integer PIN = sc.nextInt();
        sc.nextLine();
        String PhoneNumber = sc.nextLine();
    
        Account accountholder = new Account(AccountNumber, AccountName, PIN, AccountBalance, PhoneNumber);

        System.out.println("START");
        System.out.println("PUT ATM CARD HERE");
        System.out.println("Enter PIN Number");
        Integer Pin = sc.nextInt();
        if(Pin.equals(PIN)){
            System.out.println("Enter From Menu");
            System.out.println("For Deposit Press 1");
            System.out.println("For Withdawal Press 2");
            Integer k = sc.nextInt();
        
            if(k==1){
                Double Amount = sc.nextDouble();
                accountholder.AmountDeposited(Amount);
            }else if(k==2){
                Double Amount = sc.nextDouble();
                accountholder.AmountWithdrawal(Amount);
            }    
        }
        else{
            System.out.println("Entered PIN Number is Incorrect");
            System.out.println("Try Again");
        }

    }
    
}
