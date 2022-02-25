package Assignment14;
import java.util.*;
public class IntializeHashSet {

	public static void main(String[] args) {
		int arr[]= {6,3,7,9,2};
	HashSet hashSet ;
	hashSet =new HashSet();
	for(int data:arr) {
		hashSet.add(data);
	}
	System.out.println(hashSet);
	}
}
