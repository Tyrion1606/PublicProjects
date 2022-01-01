package my.digiBank;

import java.util.ArrayList;

public class Client {
    private final String name;
    private final String CPF;
    private ArrayList<Account> accounts = new ArrayList<>();

    public Client(String name, String CPF, Account account) {
        this.name = name;
        this.CPF = CPF;
        addAccount(account);
    }

    public String getName() {return name;}
    public String getCPF() {return CPF;}
    public ArrayList<Account> getAccounts() {return accounts;}

    public void addAccount(Account account){accounts.add(account);}
    public void removeAccount(Account account){accounts.remove(account);}

}
