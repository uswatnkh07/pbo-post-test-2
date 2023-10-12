//Kelas PersonalFinance
package data;

import java.util.ArrayList;
import java.util.List;

public class PersonalFinance {
    private final List<Transaction> transactions;

    public PersonalFinance() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void removeTransaction(int index) {
        transactions.remove(index);
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}