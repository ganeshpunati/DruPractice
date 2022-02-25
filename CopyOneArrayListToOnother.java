package Assignment12;
import java.util.*;
public class CopyOneArrayListToOnother {
	public static void main(String[] args) {
		ArrayList arrayList =new ArrayList();
		arrayList.add("java");
		arrayList.add("C++");
		System.out.println(arrayList);
		ArrayList list =new ArrayList(arrayList);
		list.add("Python");
		list.add("C");
		System.out.println(list);
		list.addAll(arrayList);
		System.out.println(list);
		
	}

}
