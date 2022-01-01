package my.digiBank;

public class Account {
    private int ID;         // ID unico da conta
    private double value;   // Valor contido na conta em U$
    private Client client;

    public Account(int ID, double value, Client client) {
        this.ID = ID;
        this.value = value;
        this.client = client;
    }

}
