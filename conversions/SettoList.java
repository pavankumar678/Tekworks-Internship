import java.util.*;
 class ConvertCollectionToList {
    public static void main(String args[]) {
   HashSet<String> hashset = new HashSet();
     hashset.add("Cap");
      hashset.add("T-Shirt");
      hashset.add("Jeans");
      hashset.add("Shoes");
     
      List<String> listValues = List.copyOf(hashset);
      
      System.out.println("Converted Collection to the List using List.copyOf() method: " + listValues);
    }
}