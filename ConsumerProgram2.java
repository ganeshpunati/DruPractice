package Assignment16;
import java.util.function.*;
import Assignment16data.Person;
import Assignment16data.PersonRepository;
import java.util.*;
public class ConsumerProgram2 {
	static Consumer<Person> name1 =(name)->System.out.println(name.getName()+" salary Increse the 1000 hike  : "+name.getSalary()+1000.00);
	static List<Person> list = PersonRepository.getAllPersons();
	public static void main(String[] args) {
	list.forEach(name1);
	}
}