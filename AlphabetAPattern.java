package Assignment10;
public class AlphabetAPattern {
	public static void main(String[] args) {
		for(int i=1;i<7;i++) {
			for(int j=1;j<4;j++) {
				if((i<=6 && j==1) || ((i>=2&&i<=6) && j==3) || (i==1 && j==2)|| (i==3 && j==2)){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}	
	
			}
			System.out.println();
		}
	}

}
