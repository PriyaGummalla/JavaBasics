package Test1.ConditionalLab;

public class IncrementOperatorTest2 {
    private static int num;

    public static void main(String[] args) {
        modify(num);
        System.out.println(num);
    }

    public static void modify(int num){
        ++num;
        System.out.println(num);
    }
}
