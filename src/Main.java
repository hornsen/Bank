public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Berliner Sparkasse");

        // New branch
        bank.newBranch("Bonn");

        bank.newCustomer("Bonn", "Hans", 200.00);
        bank.newTransaction("Bonn", "Hans", 100.00);

        bank.newCustomer("Bonn", "Pelle", 250.00);
        bank.newTransaction("Bonn", "Pelle", 120.00);
        bank.newTransaction("Bonn", "Pelle", 120.50);
        bank.newTransaction("Bonn", "Pelle", -20.70);

        bank.listCustomers("Bonn", true);


        // New branch
        bank.newBranch("Berlin");

        bank.newCustomer("Berlin", "Greta", 150.00);
        bank.newTransaction("Berlin", "Greta", 75.00);

        bank.newCustomer("Berlin", "Schneider", 200.00);
        bank.newTransaction("Berlin", "Schneider", 120.00);
        bank.newTransaction("Berlin", "Schneider", -90.20);

        bank.listCustomers("Berlin", false);


    }
}
