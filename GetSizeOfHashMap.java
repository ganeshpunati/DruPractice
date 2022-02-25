package Assignment14;
import java.util.*;
public class GetSizeOfHashMap {
	public static void main(String[] args) {
	HashMap hashMap =new HashMap();
	System.out.println("Before Size of The HashMap : "+hashMap.size());
	hashMap.put(102,"Yellow");
	hashMap.put(105, "Pink");
	hashMap.put(104,"red");
	hashMap.put(107,"Black");
	System.out.println("After Size of The HashMap : "+hashMap.size());
	hashMap.clear();
	if(hashMap.isEmpty()) {
		System.out.println("HashMap is Empty");
	}
	else {
		System.out.println("HashMap Not Empty");
	}
  }
}
