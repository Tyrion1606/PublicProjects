package my.digiBank;

import java.util.ArrayList;
import java.util.Random;

public class Bank {
    static ArrayList<CC> ccAccounts = new ArrayList<>();
    public static ArrayList<CC> getccAccounts() {return ccAccounts;}

    public static void main(String[] args) {
        Random random = new Random();

        ccAccounts.add(new CC("[NAME1]", "000.000.000-01"));
        ccAccounts.get(0).deposit(10);
        listAccounts();
        System.out.println("\n");

        // Criando varias contas para testar
        ccAccounts.add(new CC("[NAME2]", "000.000.000-02"));
        ccAccounts.add(new CC("[NAME3]", "000.000.000-03"));
        ccAccounts.add(new CC("[NAME4]", "000.000.000-04"));
        ccAccounts.add(new CC("[NAME2]", "000.000.000-05"));
        ccAccounts.add(new CC("[NAME1]", "000.000.000-01"));
        ccAccounts.add(new CC("[NAME3]", "000.000.000-03"));
        listAccounts();
        System.out.println("\n");

        // Varias transações para testar Extrato
        ccAccounts.get(6).deposit(10);
        ccAccounts.get(6).withdrawn(20);
        ccAccounts.get(6).deposit(30);
        ccAccounts.get(6).withdrawn(40);
        ccAccounts.get(6).deposit(50);
        listAccounts();
        System.out.println("\n");
        ccAccounts.get(6).showRegister(); // Extrato
        System.out.println("\n");

        // TESTE DE TRANSFERENCIA
        ccAccounts.get(6).transfer(20.0, 2);
        listAccounts();
        System.out.println("\n");
        ccAccounts.get(6).transfer(31.0, 2);
        listAccounts();
        System.out.println("\n");

    }

    public static void listAccounts(){
        for (Account i : ccAccounts) {
            System.out.println(i.toString());
        }
    }
}
