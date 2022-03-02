package Assignment19;
import java.util.Optional;
public class OptionalProgram {

	public static void main(String[] args) {
		String[] str=new String[10];
		str[2]="Java Optional CLASS Example";
	Optional<String> checkNull=Optional.ofNullable(str[2]);
	if(checkNull.isPresent()) {
		System.out.println(str[2].toUpperCase());
	}
	else {
		System.out.println("String value is not present");
	}
	}

}
