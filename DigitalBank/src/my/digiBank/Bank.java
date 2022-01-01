package my.digiBank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    static ArrayList<Account> Accounts = new ArrayList<>();
    public static ArrayList<Account> getAccounts() {return Accounts;}

    public static void main(String[] args) {
        Random random = new Random();

	    Accounts.add(new Account("[NAME1]", "000.000.000-01"));
        Accounts.get(0).deposit(10);
        listAccounts();
        System.out.println("\n");

        // Criando varias contas para testar
        Accounts.add(new Account("[NAME2]", "000.000.000-02"));
        Accounts.add(new Account("[NAME3]", "000.000.000-03"));
        Accounts.add(new Account("[NAME4]", "000.000.000-04"));
        Accounts.add(new Account("[NAME5]", "000.000.000-05"));
        Accounts.add(new Account("[NAME1]", "000.000.000-01"));
        Accounts.add(new Account("[NAME3]", "000.000.000-03"));
        Accounts.add(new Account("[NAME5]", "000.000.000-05"));
        Accounts.add(new Account("[NAME2]", "000.000.000-02"));
        listAccounts();
        System.out.println("\n");

        // Varias transações para testar Extrato
        Accounts.get(6).deposit(10);
        Accounts.get(6).withdrawn(20);
        Accounts.get(6).deposit(30);
        Accounts.get(6).withdrawn(40);
        Accounts.get(6).deposit(50);
        listAccounts();
        System.out.println("\n");
        Accounts.get(6).showRegister(); // Extrato

    }

    public static void listAccounts(){
        for (Account i : Accounts) {
            System.out.println(i.toString());
        }
    }
}
