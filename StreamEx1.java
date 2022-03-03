package Assignment20;
import java.util.Arrays;
import java.util.stream.*;
public class StreamEx1 {
	public static void main(String[] args) {
		IntStream.range(6,10).forEach(System.out::println);
		System.out.println(" ");
		IntStream.range(1,10).skip(2).forEach(System.out::println);
		System.out.println();
		System.out.println("Sum of range 1-5 : "+IntStream.range(1,5).sum());
		Stream.of("Ava","Avan","Ankit").sorted().findFirst().ifPresent(System.out::println);
		String[] names = {"Al","Anikit","Aresh","Avinash","kirthan","ganesh"};
		Stream.of(names).sorted().forEach(System.out::println);
		System.out.println();
		Arrays.stream(names).filter(x->x.startsWith("A")).sorted().forEach(System.out::println);
		
	}

}
