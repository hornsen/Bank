import java.util.ArrayList;

public class Customer{

    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialDeposit) {

        this.name = name;
        this.transactions = new ArrayList<Double>();
        depositMoney(initialDeposit);
    }

    public void depositMoney(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public double balance() {
        double sum=0;

        for(int i=0; i<this.transactions.size(); i++) {
            sum += this.transactions.get(i);
        }

        return sum;
    }
}