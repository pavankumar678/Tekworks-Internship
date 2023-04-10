import java.util.*;

 class ConvertCollectionToList {
    public static void main(String args[]) {
      
      HashMap<String, Integer> hashmap = new HashMap(); 
      
      hashmap.put("Mango", 55);
      hashmap.put("Apple", 88);
      hashmap.put("Guava", 99);
      hashmap.put("Banana", 77);
      
      List<Integer> listValues = new ArrayList(hashmap.values());
      
      System.out.println("Converted Collection to the List using ArrayList constructor: " + listValues);
    }
}