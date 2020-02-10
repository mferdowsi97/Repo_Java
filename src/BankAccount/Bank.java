package BankAccount;

public class Bank {
    public static void main(String[] args) {
        //Execute code
        Customer customer = new Customer("John", "Doe");
        customer.addAccount(500);
        Customer customer2 = new Customer("Foo", "Bar");
        customer2.addAccount(200);
    }
}
