package Assignment14;
import java.util.*;
public class ExistsHashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashSet =new HashSet();
		hashSet.add(23);
		hashSet.add(35);
		hashSet.add(37);
		System.out.println(hashSet);
		System.out.println("27 is Exists : "+hashSet.contains(27));
		System.out.println("35 is Exists : "+hashSet.contains(35));
	}
}
