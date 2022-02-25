package Assignment16;
import Assignment16data.*;
import java.util.*;
import java.util.function.BiConsumer;
public class BiConsumerProgram2 {
	static BiConsumer<String,Double> data =(name,salary)->System.out.println("Name: "+name+" salary: "+salary);
	static List<Person> list =PersonRepository.getAllPersons();
	public static void main(String[] args) {
		list.forEach(per->{
			data.accept(per.getName(), per.getSalary());
		});
	}

}
