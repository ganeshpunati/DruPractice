package Assignment14;
import java.util.*;
public class StringContainsDigits {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the word : ");
		String word =scanner.nextLine();
		int count=0;
		for(int i=0;i<word.length();i++) {
			if(word.charAt(i)>='0' && word.charAt(i)<='9') {
				count++;
			}
		}
		if (count == word.length()) {
			System.out.println("String contins only digits ");
		}
		else {
			System.out.println("String contions not only digits");
		}
	}

}
