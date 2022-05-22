package Test1.InheritenceLab;

public class InheritenceTest3 {
    public static void main(String[] args) {
        Child child = new Child();
        child.show();
    }
}

class Parent {
    void show() {
        System.out.println("In Parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("In child class");
    }
}
