package Assignment13;
import java.util.*;
public class HashMapDemo {
	public static void main(String[] args) {
	HashMap hashMap =new HashMap();
	hashMap.put(1,"java");
	hashMap.put(2,"C");
	hashMap.put(3,"Python");
	System.out.println(hashMap.get(3));
	System.out.println(hashMap);
	System.out.println(hashMap.containsValue("C"));
	}
}
