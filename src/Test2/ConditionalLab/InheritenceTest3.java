package Test2.ConditionalLab;

class A {
    int x = 7;
    int y = 5;

    int min(int x, int y) {
        if( x < y)
            return x;
        else
            return y;
    }
}

class B extends A {
    int x = 5;
    int y = 10;

    int min(int x, int y) {
        return 2 * super.min(x,y);
    }
}

class C extends B {
    int x = 5;
    int y = 10;

    int min(int x, int y) {
        return super.min(2 * x, 3 * y);
    }
}


public class InheritenceTest3 {
    public static void main(String[] args) {
        B c = new C();
        System.out.println("Result: " +c.min(c.x, c.y));
    }
}
