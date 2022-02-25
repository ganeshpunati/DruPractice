package Assignment11;
import java.util.*;
public class IterateElementsArrayList {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add(2);
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(7);
		list.add(4);
		System.out.println(list);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Object value=it.next();
			System.out.println(value);
		}
		
	}

}
