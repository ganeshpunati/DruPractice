package Assignment20;
import java.util.*;
public class StreamEx3 {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("Al","Anikit","Aresh","Avinash","kirthan","ganesh");
		list.stream().map(String::toLowerCase).filter(x ->x.startsWith("a")).forEach(System.out::println);
		list
		.stream()
		.map(String::toUpperCase)
		.filter(x ->x.startsWith("A"))
		.forEach(System.out::println);
	}
}
