package Test1.CollectionsLab;

import java.util.ArrayList;
import java.util.List;

public class ListTest5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Jack");
        names.add("Jim");
        names.add("Harry");
        names.add("jack");
        names.add("Harry");
        names.add("Sam");

        for (int i=0;i<names.size();i++) {
            if (names.get(i).equalsIgnoreCase("jack")) {
                names.remove(i);
            }
        }
        System.out.println(names);
    }
}
