package javatraining;
public class Assignment3 {
	public static void main(String[] args) {
		System.out.println('j'+" "+'a'+" "+'v'+" "+'a');
		String s=" Loremlpsum ";
		System.out.println(s.trim().length());
		String s1="ABCddE";
		System.out.println(s1.toLowerCase());
		String s2= "LMNOppQQ";
		System.out.println(s2.toLowerCase());
		String S1="java";
		String S2="program";
		System.out.println(S1.concat(S2));
		System.out.println("================");
		/*================*/
		float f1=2.3f,f2=4.5f,f3=7.8f;
		System.out.println(f1+"\n"+f2+"\n"+f3);
		int n=2;
		System.out.print("first 3 multiples of number : ");
		for(int i=1;i<=3;i++) {
			System.out.print(n*i+" ");
		}
		System.out.println();
		System.out.println("Cube of the number : "+n*n*n);
		int A=2,B=3;
		int C=A*B;
		System.out.println("area : "+C);
		int D=1;
		if(A>B && A>D){
				System.out.println("Largest number : "+A);
			}
		else if(B>A && B>D) {
				System.out.println("Largest number : "+B);
			}
		else {
			System.out.println("Largest number : "+D);
		}
		int k=2020;
		if(k%4 == 0) {
			System.out.println("leap year");
			System.out.println("Y");
		}
		else {
			System.out.println("Not a Leap year");
			System.out.println("N");
		}
		int x=23,y=1;
		if(x>y) {
			System.out.println("small number: "+ y);
		}
		else {
			System.out.println("small number: "+x);
		}
		 String str="aeiouAEIOU";
		 char Char='u';
		 int count =1;
		 for(int i=0;i<str.length();i++) {
			 if(Char != str.charAt(i)){
				 count++;
			 }
		 }
		 if(count == 10) {
			 System.out.println("YES");
		 }
		 else {
			 System.out.println("NO");
		 }
		 int m=9;
		 for(int i=1;i<=3;i++) {
			 System.out.print(m*i+" ");
		 }
		 System.out.println(" ");
		 int N=6;
		 for(int i=1;i<=6;i++) {
			 if(i%2==0) {
				 System.out.println(i);
			 }
		 }
		 System.out.println("================");
		 int l=10;
		 for(int i=l;i>0;i--) {
			 System.out.println(i);
		 }
	}
}
