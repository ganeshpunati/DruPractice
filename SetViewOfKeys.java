package Assignment15;
import java.util.*;
public class SetViewOfKeys {
	public static void main(String[] args) {
	Hashtable hashTable =new Hashtable();
	hashTable.put(1,"java");
	hashTable.put(2,"Python");
	hashTable.put(3,"Oracle");
	Set set =hashTable.keySet();
	Iterator iterator =set.iterator();
	while(iterator.hasNext()) {
		System.out.println(iterator.next());		
	}
  }
}
