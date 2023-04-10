import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args){
		ArrayList<String> arrList = new ArrayList<>();
		arrList.add("Mango");
		arrList.add("Apple");
		arrList.add("Orange");
		System.out.println(arrList);		LinkedList<String> linkList = new LinkedList<>(arrList);
		System.out.println("Linked List:");
		System.out.println(linkList);
	}
}