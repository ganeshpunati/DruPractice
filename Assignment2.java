package javatraining;
public class Assignment2 {
	public static void main(String[] args) {
		int a=9;
		a++;//10
		System.out.println(a);
		a--;//9
		System.out.println(a);
		++a;//10
		System.out.println(a);//10
		System.out.println(a++);//10
		System.out.println(a--);//11
		System.out.println(--a);//9
		System.out.println(++a);//10
		
/*====================================================*/
		
		String word="java";       //        valid
		String Word=" comp";     //         valid
		//String word@="java string";      invalid
		//String 12word  = "java string";  invalid
		//String int ="java";              invalid
		//String *java =" java";           invalid
		String symbol$ ="100 dollars";//     valid
		//String word ="java" ;         //   invalid
		//String word ="comp";          //   invalid
		String word_ ="java";      //        valid
		//String word- ="java";      //      invalid
		//String capital; ="delhi";          invalid
System.out.println("===========");
/*==========================================================*/	
		int ageOfPerson =20;
		int childCount =2;
		byte byteNumber =10;
		byteNumber =20;
		System.out.println(byteNumber);
		final int ageMinimun =18;
	//	ageMinimum =5;    invalid
		int age =4;
		boolean indianCitizen=true;
		System.out.println(indianCitizen== true || age==18);
		System.out.println(indianCitizen== true && age==18);
		System.out.println(age==18);
System.out.println("===========");
/*==========================================================*/	
     int[] n =new int[5];
      n[0] = 10;
      n[1] = 11;
      n[4] = 4;
      System.out.println(n);
      //System.out.println(Arrays.toString(n));
      System.out.println(n[1]);
     // System.out.println(n[8]);
      int[] arr =new int[] {1,2,3,4,5,6};
     

		

	}
}
