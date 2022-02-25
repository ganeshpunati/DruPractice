package Assignment15;
import java.util.*;
public class SublistInaList {
	public static void main(String[] args) {
		LinkedList list =new LinkedList();
		list.add(4);
		list.add(7);
		list.add(8);
		list.add(3);
		list.add(5);
		list.add(4);
		System.out.println(list);
		System.out.println(list.subList(1, 4));
	}

}
