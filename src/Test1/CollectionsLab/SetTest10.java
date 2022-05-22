package Test1.CollectionsLab;

import java.util.Set;
import java.util.TreeSet;

public class SetTest10 {

    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add("King");
        set.add("Queen");
        set.add("Ace");
        set.add("Jack");
        set.add("Queen");

        System.out.println(set);
    }
}
