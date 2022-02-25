package Assignment16;
import java.util.*;
import Assignment16data.*;
import java.util.function.Predicate;
public class PredicateProgram {
	static Predicate<Person> salary = (per) -> per.getSalary() >=2000;
	static Predicate<Person> gender = (per) -> per.getGender().equals("Female");
	public static void main(String[] args) {
		List<Person> list =PersonRepository.getAllPersons();
		list.forEach(per->{
			if(salary.and(gender).test(per))
				System.out.println(per);
		});

	}

}
