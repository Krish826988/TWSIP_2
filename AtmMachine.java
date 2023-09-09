package myProject;

import java.util.*;

class AtmProject{
    Scanner sc = new Scanner(System.in);
    int account = 310032;
    int pin = 321;
    public void checkAccount_Pin(){
        System.out.print("Enter The Account Number : ");
        int checkAcc = sc.nextInt();
        System.out.print("Enter The PIN : ");
        int checkP = sc.nextInt();
        if(checkAcc == account && checkP == pin){
            select();
        }
        else {
        	System.out.println("Please Enter The Valid Account And PIN\n");
        	checkAccount_Pin();
        }
    }
    
    public void select(){
        System.out.println("Welcom To ATM Machine");
        int balance=0,withdraw,deposite,num;
        while(true){
            System.out.println("---------------------");
            System.out.println("| 1.Withdraw        |");
            System.out.println("| 2.Deposite        |");
            System.out.println("| 3.Check Balance   |");
            System.out.println("| 4.Exite           |");
            System.out.println("---------------------");
            System.out.println();
            System.out.print("Enter The Choice : ");
            num=sc.nextInt();
            switch(num)
            {
                case 1 -> {
                    System.out.print("Enter Amount to be withdraw : ");
                    withdraw=sc.nextInt();
                    if(balance>=withdraw)
                    {
                        balance=balance-withdraw;
                        System.out.println("Balance Amount is : "+balance);
                        System.out.println("Please collect money");
                    }
                    else{
                        System.out.println("you dont have enough money for withdraw");
                        
                    }
                    System.out.println(" ");
                }
                case 2 -> {
                    System.out.print("Enter Amount to be deposite : ");
                    deposite=sc.nextInt();
                    balance=balance+deposite;
                    System.out.println("Balance Amount is : "+balance);
                    System.out.println("Money has been successfully ");
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.println("Balance of your Account is ="+balance);
                    System.out.println(" ");
                }
                case 4 -> {
                    System.exit(0);
                    System.out.println(" ");
                }
               
                   
            }
            
        }
    }
}

public class AtmMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmProject obj = new AtmProject();
		obj.checkAccount_Pin();
	}

}
