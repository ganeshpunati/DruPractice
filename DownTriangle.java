package Assignment10;
public class DownTriangle {
	public static void main(String[] args) {
		int px=1,py=9;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=9;j++) {
				if(j==px||j==py||i==1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			px++;
			py--;
			System.out.println();
		}
	}

}
