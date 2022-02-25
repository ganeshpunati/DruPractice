package Assignment16Practice;
import java.util.function.BiConsumer;
import java.util.*;
public class BiConsumerExample2 {
		static BiConsumer<Integer,Integer> digit1 =(a,b) -> System.out.println("Addition : "+a+b);
		static BiConsumer<String,Long> word =(a,b)->System.out.println(a+" Number is : "+b);
	public static void main(String[] args) {
	//	digit1.accept(5,4);
	//	word.accept("ganesh",9346307419l);
		BiConsumer<Integer,Integer> digit2 =(a,b) -> System.out.println("Multiplication : "+a*b);
	//	digit1.andThen(digit2).accept(6, 4);
		List<Integer> list1 =Arrays.asList(4,6,8,3,9,5,8);
		List<Integer> list2 =Arrays.asList(4,6);
		BiConsumer<List<Integer>,List<Integer>> sizeCheck =(l1,l2)->{
			if(l1.size() > l2.size()) {
				System.out.println("List1 size is Long");
			}
			else {
				System.out.println("List2 size is Long");
			}
		};
		if(list1.size() < list2.size()) {
			System.out.println("List1 size is Long");
		}
		else {
			System.out.println("List2 size is Long");
		}
		  sizeCheck.accept(list1, list2);
	}

}
