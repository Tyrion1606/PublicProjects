package my.digiBank;

import java.util.ArrayList;
import java.util.Date;

public class Account implements AccountInterface{
    private int ID;         // ID unico da conta
    private double value;   // Valor contido na conta em U$
    private Client client;  // Toda conta possui um cliente
    private ArrayList<String> register = new ArrayList<>();

    private Date date = new Date();

    // Construtor
    protected Account(String clientName, String clientCPF) {
        this.client = new Client(clientName, clientCPF, this);
        client.addAccount(this);
        this.ID = Bank.getccAccounts().size();
        this.value = 0;
    }

    // Consultores
    public int getID() {return ID;}
    public Client getClient() {return client;}
    public double getValue() {return value;}

    // Métodos da Classe
    public String deposit (double amount) {
        this.value += amount;
        String reg = ("Deposit of: " + amount + "$ at " + date.toString());
        register.add(reg);
        System.out.println(reg);
        return reg;
    }
    public String withdrawn (double amount) {
        if (amount > this.value){
            System.out.println("Insuficient Cash. Whithdrawn of " + amount + " Not realized.");
            return ("Insuficient Cash");
        }
        this.value -= amount;
        String reg = ("withdrawn of: " + amount + "$ at " + date.toString());
        register.add(reg);
        System.out.println(reg);
        return reg;
    }
    public void showRegister(){
        System.out.println("transactions at " + this.ID + " account of " + this.client.getName() + ":");
        for (String s: register) {System.out.println(s);}
    }


    @Override
    public String toString() {
        return  "ID:" + ID +
                "   client:" + client.getName() +
                "   value:" + value;
    }
}
