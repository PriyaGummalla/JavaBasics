package Test1.ConditionalLab;

public class IfTest12 {
    public static void main(String[] args) {
        String str = "null";
        if ( str == null) {
            System.out.println("Null value");
        } else if (str.length() == 0) {
            System.out.println("zero value");
        } else if(str == new String("null")) {
            System.out.println("equall to null");
        } else if (str == "null") {
            System.out.println("Some value");
        } else {
            System.out.println("other");
        }
    }
}
