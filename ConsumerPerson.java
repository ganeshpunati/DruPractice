package Assignment16Practice;
import java.util.function.Consumer;
import Assignment16data.*;
import java.util.*;
public class ConsumerPerson {
	static Consumer<Person> name1=(s)->System.out.println(s);
	static Consumer<Person> name2=(s)->System.out.println(s.getName().toUpperCase()+" salary is : "+s.getSalary());
	static List<Person> list=PersonRepository.getAllPersons();
	public static void main(String[] args) {
		//list.forEach(name1);---
		//list.forEach(name2);
		//list.forEach(name1.andThen(name2));
		//printwithCondition();
		//ConsumerPerson cp =new ConsumerPerson();
		//cp.printCondition();
		list.forEach(s->{
			if(s.getGender().equals("Male") && s.getHeight()>=140){
			name1.andThen(name2).accept(s);
			}
		});
	}
	static void printwithCondition() {
		//list.forEach(name1);
		list.forEach(name1.andThen(name2));
	}
     void printCondition() {
		list.forEach(s->{
			if(s.getGender().equals("Male") && s.getHeight()<=140){
			name1.andThen(name2).accept(s);
			}
		});
	}
}
