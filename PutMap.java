import java.util.HashMap;
import java.util.Map;

public class PutMap {

    public static void main(String... oquevocequiser) {
        
        Map<Map<Object, String>, String> mainMap = new HashMap<>();

        System.out.println("mainMap" + mainMap);

        Map<Object, String> subMap1 = new HashMap<>();
        subMap1.put(1, "A");

        System.out.println("subMap1" + subMap1);

        Map<Object, String> subMap2 = new HashMap<>();
        subMap2.put(1, "A");

        System.out.println("subMap2" + subMap2);

        Map<Object, String> subMap3 = new HashMap<>();
        subMap3.put(1, "A");

        System.out.println("subMap3" + subMap3);

        mainMap.put(subMap1, "crazyMap1");
        mainMap.put(subMap2, "crazyMap2");
        mainMap.put(subMap3, "crazyMap3");

        System.out.println(mainMap.size());
    }
}