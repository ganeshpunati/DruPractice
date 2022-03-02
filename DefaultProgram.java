package Assignment19;
public class DefaultProgram implements DefultInterface {
	public static void main(String[] args) {
		DefultInterface di= new DefaultProgram();
		di.show();
		new DefaultProgram().show();
	}

}
