package Assignment11;
import java.util.*;
public class HashSetExists{			
	public static void main(String[] args) {		
	HashSet list =new HashSet();	
	list.add("Java");
	list.add("Python");	
	list.add("c");  	
	System.out.println(list);      
    System.out.println(list.add("c++"));
	System.out.println(list.contains("java"));		
	}
}