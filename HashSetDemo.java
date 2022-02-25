package Assignment13;
import java.util.*;
public class HashSetDemo {
	public static void main(String[] args) {
		HashSet hashSet=new HashSet();
		hashSet.add("Java");
		hashSet.add("python");
		hashSet.add(hashSet);
		System.out.println(hashSet);
		System.out.println(hashSet.add("C++"));
		System.out.println(hashSet);
	}

}
