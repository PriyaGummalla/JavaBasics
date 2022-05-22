package Test1.ExceptionsLab;

public class ExceptionTest9 {
    public static void main(String[] args) {
        try {
            method(5);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        }
    }

    public static void method(Integer i) {
        int[] arr = { 1, 2, 3, 4, 0 };
        if (i == 0) {
            throw new ArithmeticException();
        }
        System.out.println(arr[i] / i);
    }

}
