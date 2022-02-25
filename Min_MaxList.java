package Assignment15;
import java.util.*;
public class Min_MaxList {
	public static void main(String[] args) {
		int arr[] = {4,7,9,3,6,8};
		ArrayList list =new ArrayList();
		for(int data:arr) {
			list.add(data);
		}
		System.out.println("Given List : "+list);
		System.out.println("MIN number : "+Collections.min(list));
		System.out.println("MAX number : "+Collections.max(list));
		
	}

}
