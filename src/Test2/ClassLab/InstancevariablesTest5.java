package Test2.ClassLab;


class Customer {
    int customerId;
    String name;
    double salary;

    Customer(int cid, String name) {
        String str = name;
        customerId = cid;
        this.name = name;
        this.salary = salary;
    }
}
public class InstancevariablesTest5 {
    public static void main(String[] args) {
        Customer customer = new Customer(1, "priya");
    }

}


//Reference : https://pediaa.com/what-is-the-difference-between-instance-variable-and-local-variable/#:~:text=An%20instance%20variable%20is%20a%20variable%20that%20is%20declared%20in,instance%20variable%20and%20local%20variable.