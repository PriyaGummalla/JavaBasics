package Test1.InheritenceLab;

public class InheritenceTest6 {

    public static void main(String[] args) {

        Base base = new Base();
        base.display(10F);
    }
}

class Base {
    public void display(Integer a) {
        System.out.println("From integer method");
    }

    public void display(Object a) {
        System.out.println("From Object method");
    }
}
