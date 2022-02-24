package javatraining;
import java.util.*;
public class Assignment5 {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the FirstWord  :");
		String firstWord =scanner.nextLine();
		System.out.println("Enter the SecoundWord :");
		String secoundWord = scanner.nextLine();
		char firstWord1[]   =   firstWord.trim().toLowerCase().replaceAll("\\s","").toCharArray();
		char secoundWord1[] = secoundWord.trim().toLowerCase().replaceAll("\\s","").toCharArray();
		Arrays.sort(firstWord1);
		Arrays.sort(secoundWord1);
		if(firstWord1.length == secoundWord1.length) {
			int count=0;
			for(int i=0,j=0;i<firstWord1.length;i++,j++) {
				if(firstWord1[i]==secoundWord1[j]) {
					count++;
				}
			}
			if(count == firstWord1.length) {
				System.out.println("Anargam");
			}
			else {
				System.out.println("Not anargam");
			}
		}
		else {
			System.out.println("not Anargam");
		}
	}
}
