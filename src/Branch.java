import java.util.ArrayList;

public class Branch{

    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public Customer findCustomer(String name) {

        for(int i=0; i<this.customers.size(); i++) {
            Customer searchCustomer = this.customers.get(i);

            if(searchCustomer.getName().equals(name)) {
                return searchCustomer;
            }
        }

        return null;
    }

    public boolean newCustomer(String name, double initialDeposit) {

        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialDeposit));
            return true;
        }

        return false;
    }

    public boolean newTransaction(String name, double amount) {
        if(findCustomer(name) != null) {
            Customer customer = findCustomer(name);
            customer.depositMoney(amount);
            return true;
        }

        return false;
    }
}