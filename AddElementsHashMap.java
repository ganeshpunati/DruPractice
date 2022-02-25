package Assignment14;
import java.util.*;
public class AddElementsHashMap {
	public static void main(String[] args) {
	HashMap<String,String> hashMap =new HashMap<String,String>();
	hashMap.put("Name","Ganesh");
	hashMap.put("Animal","dog");
	hashMap.put("Bird","Parraot");
	hashMap.put("color","yellow");
	System.out.println(hashMap);
	System.out.println(hashMap.size());
	System.out.println(hashMap.get("Name"));
	}

}
