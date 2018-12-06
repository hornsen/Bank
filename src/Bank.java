import java.util.ArrayList;

public class Bank{

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){

        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public Branch findBranch(String name) {
        for(int i=0; i<this.branches.size(); i++) {
            Branch searchBranch = this.branches.get(i);

            if(searchBranch.getName().equals(name)) {
                return searchBranch;
            }
        }

        return null;
    }

    public boolean newBranch(String branchName) {
        Branch branch = findBranch(branchName);

        if(branch == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    public boolean newCustomer(String branchName, String customerName, double initialDeposit) {
        Branch branch = findBranch(branchName);

        if(branch == null) {
            return false;
        }

        branch.newCustomer(customerName, initialDeposit);
        return true;

    }

    public boolean newTransaction(String branchName, String customerName, double amount) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            branch.newTransaction(customerName, amount);
            return true;
        }

        return false;
    }




    public void listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            ArrayList<Customer> branchCustomer = branch.getCustomers();

            for(int i=0; i<branchCustomer.size(); i++) {
                Customer customer = branchCustomer.get(i);
                System.out.println("Customer: " + customer.getName());

                ArrayList<Double> customerTransactions = customer.getTransactions();
                System.out.println("Total balance: " + customer.balance() + " EUR");


                if(showTransactions) {
                    System.out.println("Transactions: ");
                    for(int j=0; j<customerTransactions.size(); j++) {
                        System.out.println(customerTransactions.get(j) + " EUR  [" + (j+1) + "]");
                    }

                }
                System.out.println("\n");
            }
        }
    }


}