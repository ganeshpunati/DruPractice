package Assignment16Practice;
import Assignment16data.*;
import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerPerson {
	static BiConsumer<String,List<String>> c1=(name,hobbies)->System.out.println("Name is "+name+" And his hobbies is "+hobbies);
	static List<Person> list =PersonRepository.getAllPersons();
	public static void main(String[] args) {
		fetchHobbies();
	}
	
	static void fetchHobbies() {
		list.forEach(person->{
			c1.accept(person.getName(),person.getHobbies());
		});
	}
}
