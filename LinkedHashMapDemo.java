package Assignment13;
import java.util.LinkedHashMap;
public class LinkedHashMapDemo{
	public static void main(String[] args) {
		LinkedHashMap linkedHashMap=new LinkedHashMap();
		System.out.println(linkedHashMap.size());
		linkedHashMap.put(101,"yellow");
		linkedHashMap.put(102,"Black");
		System.out.println(linkedHashMap.put(104,"Red"));
		System.out.println(linkedHashMap.size());
		System.out.println(linkedHashMap);
	}
}
