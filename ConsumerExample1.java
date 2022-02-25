package Assignment16Practice;
import java.util.function.*;
public class ConsumerExample1 {
	static Consumer<String> c1=(s) ->System.out.println(s.toUpperCase());
	static Consumer<String> c2=(s) -> {System.out.println(s.toLowerCase());};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c1.accept("ganesh");
		c2.accept("Java");
		c1.andThen(c2).accept("Java program");
		Consumer<Integer> c3=(s)->System.out.println(s+5);
		BiConsumer<Integer,Integer> c4=(x,y)->System.out.println(x+y);
		c3.accept(12);
		c4.accept(10, 20);
	}

}
