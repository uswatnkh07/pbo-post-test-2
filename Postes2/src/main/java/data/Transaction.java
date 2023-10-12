////Kelas Transaction
package data;

public class Transaction {
    private String Type;
    private double Amount;

    public Transaction(String type, double amount) {
        this.Type = type;
        this.Amount = amount;
    }

    public String getType() {
        return Type;
    }

    public double getAmount() {
        return Amount;
    }

    public void setType(String newType) {
        this.Type = newType;
    }

    public void setAmount(double newAmount) {
        this.Amount = newAmount;
    }
}

