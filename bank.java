import java.util.*;

public class Bank {
    String customerName,customerAccountNumber;
    int accountBalance;
    public Bank(String name,String accountNumber, int balance){
        customerName=name;
        customerAccountNumber=accountNumber;
        accountBalance=balance;
    }
    
    public void deposit(int money){
        accountBalance+=money;
        System.out.println(money+"credited successfully.Your current balance is"+accountBalance+"\n");
    }
    
    public void withDraw(int money){
        if(money>0 && money<accountBalance){
            accountBalance-=money;
            System.out.println(money+" Money Debited Successfully.Your current balance is "+accountBalance);
        }
        else{
            System.out.println("Sorry can't able to complete your request\n");
        }
    }
    
    public void getBalance(){
        System.out.println("your balance is "+accountBalance+"\n");
    }
    
    public void getCustomerName(){
        System.out.println(customerName+"\n");
    }
    
    public void getCustomerAccountNumber(){
        System.out.println(customerAccountNumber+"\n");
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your accountName,accountNumber,accountInitialBalance:\n");
        String accountHolderName=sc.nextLine();
        String accountHolderNumber=sc.nextLine();
        int balance=sc.nextInt(); 
        Bank account=new Bank(accountHolderName,accountHolderNumber,balance);
        System.out.println("Your bank Account is created Successfully\n");
        
        while(true){
            System.out.println("Welcome again "+accountHolderName+"\nChoose an option 1.Deposit\n 2.withDraw\n 3.checkBalance\n 4.checkAccountHolderNumber \n5.checkAccountHolderName\n6.Exit\n");
            int option=sc.nextInt();
            if(option==6){
                System.out.println("Bye!!");
                break;
            }
        switch(option){
            case 1:
                System.out.println("Enter Amount to credit:");
                int credit=sc.nextInt();
                account.deposit(credit);
                break;
            case 2:
                System.out.println("Enter Amount to debit:");
                int debit=sc.nextInt();
                account.withDraw(debit);
                break;
            case 3:
                account.getBalance();
                break;
            case 4:
                account.getCustomerAccountNumber();
                break;
            case 5:
                account.getCustomerName();
                break;
        }
            
        }
       
    }
}
