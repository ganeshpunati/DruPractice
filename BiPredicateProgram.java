package Assignment16;
import Assignment16data.*;
import java.util.function.BiPredicate;
import java.util.*;
public class BiPredicateProgram {
	static BiPredicate<String,Integer> data=(gender,height)->gender=="Female" && height>120;
	public static void main(String[] args) {
		List<Person> list =PersonRepository.getAllPersons();
		list.forEach(per->{
			if(data.test(per.getGender(), per.getHeight())) {
				System.out.println(per);
			}
		});
	}

}
