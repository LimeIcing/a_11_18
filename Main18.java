import java.util.HashMap;
import java.util.Map;

public class Main18 {

    /*
    Write a method called reverse that accepts a map from strings to strings as a parameter and returns a new map that
    is the reverse of the original. The reverse of a map is a new map that uses the values from the original as its keys
    and the keys from the original as its values. Since a map’s values need not be unique but its keys must be, you
    should have each value map to a set of keys. In other words, if the original map maps keys of type K to values of
    type V, the new map should map keys of type V to values that are Set s containing elements of type K. For example,
    the map {42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed} has a reverse of
    {Marty=[42, 3], Sue=[81], Ed=[17, 56, 29], Dave=[31]} . (The order of the keys and values does not matter.)
     */

    public static void main(String[] args) {
        HashMap<String, String> a = new HashMap<>();
        a.put("42","Marty");
        a.put("81","Sue");
        a.put("17","Ed");
        a.put("31","Dave");
        a.put("56","Ed");
        a.put("3","Marty");
        a.put("29","Ed");
        HashMap<String, String> b = new HashMap<>(reverse(a));
        System.out.println(b);
    }

    public static Map<String, String> reverse(Map<String, String> map) {
        HashMap<String, String> returnMap = new HashMap<>();

        for (Map.Entry<String, String> entry:map.entrySet()) {
            returnMap.put(entry.getValue(), entry.getKey());
        }

        return returnMap;
    }
}
