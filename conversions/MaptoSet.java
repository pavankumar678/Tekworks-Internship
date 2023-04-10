import java.util.*;
 class MapToSetExample {
    public static void main(String args[]) {
  
        Map<Integer, String> map = new HashMap<>(); 
        map.put(1, "India");
        map.put(2, "USA");
        map.put(3, "UK");
        map.put(4, "Canada");
        map.put(5, "Germany");
      Set<Integer> set1 = new HashSet(map.keySet());
        System.out.println("Converted Map keys to Set using constructor: " + set1);        Set<String> set2 = new HashSet(map.values());
        System.out.println("Converted Map values to Set using constructor: " + set2);
    }
}