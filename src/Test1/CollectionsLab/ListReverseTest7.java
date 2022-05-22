package Test1.CollectionsLab;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListReverseTest7 {
    public static void main(String[] args) {
        List<String> listOfNames = Arrays.asList("Jim", "Tim", "John", "Sam");
//        Collections collections = new Collection();
//        listOfNames.reverse(listOfNames);
//        collections.reverse(listOfNames);
        listOfNames.forEach(e -> System.out.println(e+ " "));
    }
}
