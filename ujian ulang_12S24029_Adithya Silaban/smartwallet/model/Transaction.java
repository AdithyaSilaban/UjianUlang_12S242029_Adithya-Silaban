package smartwallet.model;

public class Transaction {
    public Transaction(int id, String username, double amount, String timestamp, String description) {
        
    }

    public abstract class Transactions {

    protected int id;
    protected String username;
    protected double amount;
    protected double fee;
    protected double netAmount;
    protected String timestamp;
    protected String description;
    


    public Transactions(int id, String username, double amount, double fee, double netAmount, String timestamp, String description) {
        this.id = id;
        this.username = username;
        this.amount = amount;
        this.fee = netAmount;
        this.timestamp = timestamp;
        this.description = description;
    }

    public abstract String getType();

}

}
