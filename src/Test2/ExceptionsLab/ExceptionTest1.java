package Test2.ExceptionsLab;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            methodAlpha(10);
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
        } finally {
            System.out.println("C");
        }
        System.out.println("D");
    }

    public static void methodAlpha( int a) throws Exception {
        if (a > 10 ) {
            throw new Exception();
        }
    }
}
