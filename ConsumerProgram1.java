package Assignment16;
import java.util.function.Consumer;
import Assignment16data.Person;
import Assignment16data.PersonRepository;
import java.util.*;
public class ConsumerProgram1 {
	static Consumer<Person> name1 =(name)->System.out.println("Gender of each person to uppercase : "+name.getGender().toUpperCase());
	static List<Person> list = PersonRepository.getAllPersons();
	public static void main(String[] args) {
	list.forEach(name1);

	}

}
