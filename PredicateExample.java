package Assignment16Practice;
import java.util.function.Predicate;
public class PredicateExample {
	static Predicate<Integer> lessThen=num->num<50;
	static Predicate<Integer> equals=num->num==50;
	public static void main(String[] args) {
		boolean lessThenResult =lessThen.test(70);
		boolean equalresult =equals.test(50);
		System.out.println(lessThenResult);
		System.out.println(equalresult);
		Predicate<Integer> gt=a -> a>50;
		boolean gtThen =gt.test(20);
		System.out.println("And : "+gt.and(lessThen).test(20));
		System.out.println("OR : "+gt.or(lessThen).test(20));
		System.out.println("OR :"+gt.or(equals).test(50));
	}
}
