package Assignment16;
import Assignment16data.*;
import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerProgramm1 {
	static BiConsumer<Double,List<String>> data=(salary,hobbies)->System.out.println("salary: "+salary+", hobbies: "+hobbies);
	static List<Person> list=PersonRepository.getAllPersons();
	public static void main(String[] args) {
	list.forEach(per->{
		data.accept(per.getSalary(),per.getHobbies());
	});
	}
}
