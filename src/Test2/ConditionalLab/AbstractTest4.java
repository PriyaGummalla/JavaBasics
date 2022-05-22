package Test2.ConditionalLab;


abstract class MyabstractClass {
    public void go() {
        System.out.println("In abs class");
    }
}

interface MyInterface {
    public void go();
}

class MyClass extends MyabstractClass implements MyInterface {
    public void go() {
        System.out.println("In testclass");

    }
}

public class AbstractTest4 {

    public static void main(String[] args) {
        MyClass t = new MyClass();
        t.go();
    }

}


