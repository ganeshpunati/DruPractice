package Assignment11;
import java.util.ArrayList;
public class ExisttsInArray {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(5);
		System.out.println(list);
		System.out.println(list.indexOf(2));
		System.out.println(list.contains(4));
		}
}
