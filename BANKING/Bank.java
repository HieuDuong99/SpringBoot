package BANKING;

import BANKING.account.Account;
import BANKING.account.CreditAccount;
import BANKING.account.DebitAccount;
import BANKING.account.SavingsAccount;
import Stack.Array;


public class Bank {

    public static void main(String[] args) {
        User user=new User("001","Tran Van A","20/1/2000","02939933","1A ");
        user.display();

        Account account = new DebitAccount(001, "001", "Tran Van A", 50000);
        Account account1 = new CreditAccount(002,"001","Tran Van A",12);
        Account account2 = new SavingsAccount(003,"001","Tran Van A",1000000,2);
//        user.addAccount(account);
//        user.addAccount(account1);
//        user.addAccount(account2);
//        System.out.println("Cac the hien dang su huu");
//        user.show();
//        user.removeAccount(003);
//        System.out.println("The con lai");
//        user.show();

        account.deposit(100000);
        account.display();
//
//        account.withdraw(200000);
//        account.withdraw(140000);
//        account.withdraw(20000);
//        account.display();
//
        account = new SavingsAccount(004, "001", "Hieu", 50000, 1.2);
        account.display();
//
//        account = new CreditAccount("003", "001", "Hieu", 5000000);
//        account.withdraw(4500000);
//        account.display();
//        account.withdraw(600000);
//
//        System.out.println("Testing complete");

    }
}
