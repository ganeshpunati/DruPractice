package Assignment14;
public class CountOccurrenceeOfString {
	public static void main(String[] args) {
		String string ="hello word";
		char ch='l';
		int count=0;
		for(int i=0;i<string.length();i++) {
			if(string.charAt(i) ==ch) {
				count++;
			}
		}
		System.out.println("count the occurrense of a given character " +ch+ ": "+count);
	}

}
