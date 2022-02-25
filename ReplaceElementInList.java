package Assignment15;
import java.util.*;
public class ReplaceElementInList {
	public static void main(String[] args) {
		ArrayList list =new ArrayList();
		list.add("Yellow");
		list.add("pink");
		list.add("Red");
		list.add("grean");
		list.add("Orange");
		System.out.println("Before replace List : "+list);
		list.set(2,"black");
		System.out.println("After replace list : "+list);

	}

}
