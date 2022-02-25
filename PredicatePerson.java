package Assignment16Practice;
import java.util.*;
import Assignment16data.*;
import java.util.function.Predicate;
public class PredicatePerson {
	
	static Predicate<Person> hight = (per) -> per.getHeight() >=140;
	static Predicate<Person> gender = (per) -> per.getGender().equals("Male");	
	public static void main(String[] args) {
		List<Person> list =PersonRepository.getAllPersons();
	    list.forEach((per) ->{
	    if(hight.and(gender).test(per))
	    System.out.println(per);
	    });

	}

}
