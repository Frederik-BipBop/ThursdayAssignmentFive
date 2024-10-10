package Task1;

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Frederik", "Nielsen" ,"FredNiels1234"));
        customers.add(new Customer("Lise", "Knudsen" ,"KnudsenL345"));
        customers.add(new Customer ("Lars", "Larsen" ,"LarsLarsen532"));
        printCustomers(customers);
    }
    public static void printCustomers (ArrayList<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}