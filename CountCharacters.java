package Assignment6;
import java.util.Scanner;
public class CountCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String word=scanner.nextLine().toLowerCase().trim().replaceAll("\\s","");
		System.out.println("total characters in a String : "+word.length());
		String vowels ="aeiou";
		int vowelsCount=0;
		for(int i=0;i<word.length();i++) {
			for(int j=0;j<vowels.length();j++) {
				if(word.charAt(i)==vowels.charAt(j)) {
					vowelsCount++;
				}
			}
		}
		int consonantCount =word.length()-vowelsCount;
		System.out.println("Vovels Count : "+vowelsCount);
		System.out.println("Consonant Count : "+consonantCount);
		
	}	

}
