package Assignment13;
import java.util.*;
public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap treeMap =new TreeMap();
		treeMap.put(101,"java");
		treeMap.put(102,"C");
		treeMap.put(103,"Python");
		System.out.println(treeMap);
		System.out.println(treeMap.clone());
		System.out.println(treeMap.containsKey(103));
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastEntry());
		
		

	}

}
