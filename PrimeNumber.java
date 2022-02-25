package Assignment7;
import java.util.*;
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter The value : ");
		int value =scanner.nextInt();
		int i=1;
		int count=0;
		while(i<=value) {
			if(value%i == 0) {
				count ++;
			}
		i++;
		}
		if(count == 2) {
			System.out.println(value + " is prime Number");
		}
		else {
			System.out.println(value + " is not prime Number");
		}
	}
}
