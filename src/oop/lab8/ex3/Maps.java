package lab8.ex3;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class Maps {
    public static int count(Map<Integer, Integer> map){
        return map.size();
    }
    public static void empty(Map<Integer, Integer> map){
        map.clear();
    }
    public static boolean contains(Map<Integer, Integer> map, int key){
        return map.containsKey(key);
    }
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value){
        return (map.containsKey(key) && map.get(key).equals(value));
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map){
        return map.keySet();
    }
    public static Collection<Integer> values(Map<Integer, Integer> map){
        return map.values();
    }
    public static String getColor(int value) {
        // Tạo một map nội bộ để ánh xạ giữa giá trị và màu sắc
        Map<Integer, String> colorMap = new HashMap<>();
        colorMap.put(0, "black");
        colorMap.put(1, "white");
        colorMap.put(2, "red");

        // Trả về màu sắc tương ứng với giá trị đầu vào từ map
        return colorMap.get(value);
    }
}
