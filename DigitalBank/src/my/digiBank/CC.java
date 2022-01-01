package my.digiBank;

public class CC extends Account{
    protected CC(String clientName, String clientCPF) {
        super(clientName, clientCPF);
    }

    public void transfer(Double amount, int ID) {
        if (this.getValue() >= amount) {
            this.withdrawn(amount);
            Bank.ccAccounts.get(ID).deposit(amount);
        } else {
            System.out.println("Saldo insuficiente, Transferencia não realizada");
        }
    }
}
