package Test2.CollectionsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Customer {
    int customerId;
    String customerName;

    Customer(int cid, String name) {
        this.customerId = cid;
        this.customerName = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
public class ListTest6 {
    public static void main(String[] args) {

        List<Customer> list = new ArrayList<>();
        Customer c1 = new Customer(9001, "Patrick");
        Customer c2 = new Customer(9002, "Mary");
        Customer c3 = new Customer(9003, "Anupam");

        list.add(c1);
        list.add(c2);
        list.add(c3);

        Stream<Customer> stream = list.stream().filter(customer -> customer.getCustomerName().length() >= 5);
        stream.forEach(customer -> System.out.println(customer.getCustomerId() + " "));
    }
}
