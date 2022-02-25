package Assignment16Practice;
import java.util.function.BiPredicate;
public class BiPredicateExample {
	static BiPredicate<Integer,Integer> data=(a,b)->a>50 && b<50;
	public static void main(String[] args) {
		System.out.println(data.test(100,30));
	}
}