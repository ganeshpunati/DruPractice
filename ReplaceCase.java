package Assignment6;
import java.util.Scanner;
public class ReplaceCase {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String word=scanner.nextLine();
		String newWord="";
		for(int i=0;i<word.length();i++) {
		if(word.charAt(i)>='a' && word.charAt(i)<='z'){
			newWord =newWord+(char)((int)word.charAt(i)-32);
		}
		else if(word.charAt(i)>='A' && word.charAt(i)<='Z') {
			newWord =newWord+(char)((int)word.charAt(i)+32);
		}
		else {
			newWord =newWord+word.charAt(i);
		}
		}	
		System.out.println(newWord);

	}

}
