package Assignment20;

import java.util.Arrays;

public class StreamEx2 {
	public static void main(String[] args) {
		Arrays.stream(new int[] {2,4,6,8,10}).map(x->x*x).average().ifPresent(System.out::println);
		Arrays.stream(new int[] {2,4,6,8,10}).map(x->x+x)
		.average()
		.ifPresent(System.out::println);
	}

}
