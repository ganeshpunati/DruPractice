package Assignment14;
public class Non_RepeatedCharacter {
	public static void main(String[] args) {
		String word="program";
		System.out.print("Non_repeatinng characters : ");
		for(char data:word.toCharArray()) {
			if(word.indexOf(data) == word.lastIndexOf(data)) {
				System.out.print(data+" ");
			}
		}
			
		}
}
