package Test2.CollectionsLab;

import java.util.ArrayList;
import java.util.List;

class Employee {

    private String firstName;

    public Employee(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String toString() {
        return firstName;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other)
            return true;
        if (other == null || getClass() != other.getClass())
            return false;

        Employee employee = (Employee) other;

        return firstName.equals(employee.firstName);
    }

    @Override
    public int hashCode() {
        return firstName.hashCode();
    }
}
public class ListTest7 {

    public static void main(String[] args) {
        Employee emp1 = new Employee("John");
        Employee emp2 = new Employee("Joe");
        Employee emp3 = new Employee("Sam");

        List<Employee> list = new ArrayList<>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);

        System.out.println("Before: " + list);

        for (int j = 0; j < list.size(); j++) {
            Employee e = list.get(j);
            if(e.equals((emp1)))
                list.remove(j);
        }

        System.out.println(" After: " + list);
    }
}
