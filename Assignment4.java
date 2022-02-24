package javatraining;
import java.util.*;
public class Assignment4 {
	public static void main(String[] arg) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the word");
		String st =sc.nextLine();
		int count =0;
		System.out.println("Reverse Number :");
		for(int i=st.length()-1,j=0; j<st.length() ;i--,j++) {
			System.out.print(st.charAt(i));
			if(st.charAt(i) == st.charAt(j)) {
				count++;
			}			
		}
		System.out.println(" ");
		if(count == st.length()) {
			System.out.println("Palidram");
		}
		else {
			System.out.println("Not palidram");
		}
	}
}