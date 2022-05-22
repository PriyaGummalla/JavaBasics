package Test2.CollectionsLab;

import java.util.Map;
import java.util.TreeMap;

public class MapTest8 {
    public static void main(String[] args) {
        Map<String, String> map = new TreeMap<>();
        map.put("Infosys", "Technologies");
        map.put(map.get("Infosys"), "Limited");
        map.put(map.get("Technologies"),"Infosys");

        System.out.println(map);
    }
}
