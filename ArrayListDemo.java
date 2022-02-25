package Assignment13;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> list =new ArrayList<String>();
		list.add("12");
		list.add("15");
		list.add("20");
		ListIterator listIterator =list.listIterator();
		listIterator.add("18");
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());	
		}
System.out.println(list);
	}

}
