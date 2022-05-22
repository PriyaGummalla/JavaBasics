package Test1.ExceptionsLab;

public class ExceptionTest8 {
    public static void main(String[] args) {
        try {
            method(5);
        } catch (ArithmeticException e) {
            System.out.println("Arithemtic Exception");

        } catch (RuntimeException e) {
            System.out.println("Runtime Exception");

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

    public static void method(Integer num) {
        int[] arr = {1, 2, 3, 4, 0 };
        if (num == 0) {
            throw new ArithmeticException();
        }

        if ( num == null) {
            throw new NullPointerException(" Varible can't have a null value");
        }

        System.out.println(arr[num] / num);
    }
}


