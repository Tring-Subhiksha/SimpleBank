package org.example;

import java.util.*;
import java.lang.*;

class App
{
    String user_name;
    long balance;
    long acc_number;

    App(String name,long number,long bal){
        user_name=name;
        acc_number=number;
        balance=bal;
    }
    void deposit()
    {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter the amount to deposit your account:");
        long amt=c.nextLong();
        balance=balance+amt;
        System.out.println("The deposit of the amount is:"+balance);
        System.out.println("\n");

    }
    void withdraw(long amt2)
    {
        if(balance>=amt2)
        {
            balance=balance-amt2;
            System.out.println("The Withdraw of the amount is:"+balance);
        }
        else{
            System.out.println("The Amount is less than your Balance \tTransaction failed");
        }

    }
    void curr_balance(){
        System.out.println("The current balance of your account:" +balance);
    }
    void display(){
        System.out.println("The Accounts holder name is "+user_name);
        System.out.println("\nThe Accounts number of the User account is "+acc_number);
        System.out.println("\nThe Balance of your account is "+balance);
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter a Account Holder Name:");
        String h=s.nextLine();
        System.out.println("Enter the Account Number:");
        long a=s.nextLong();
        System.out.println("Enter the Balance amount:");
        long b=s.nextLong();
        App ac=new App(h,a,b);

        while(true){
            System.out.println("\n Bank Transaction details\n1.Show your account details\n2.Deposit your amount\n3.Withdraw your amount\n4.Check current balance of your account\n5.Exit\n");
            System.out.println("\nEnter your choice:");
            int ch=s.nextInt();

            switch (ch) {
                case 1 -> ac.display();
                case 2 -> ac.deposit();
                case 3 -> {
                    System.out.println("Enter the amount to Withdraw your account:");
                    Scanner c = new Scanner(System.in);
                    long amt = c.nextLong();
                    ac.withdraw(amt);
                }
                case 4 -> ac.curr_balance();
                case 5 -> {
                    System.out.println("\nExiting...");
                    System.exit(0);
                }
                default -> System.out.println("Please enter correct choice");
            }
        }
    }
}