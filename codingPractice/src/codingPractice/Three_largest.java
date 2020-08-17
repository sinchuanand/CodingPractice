import java.util.Scanner;

public class Three_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first num");
		int a =sc.nextInt();
		System.out.println("Enter the second num");
        int b= sc.nextInt();
        System.out.println("Enter the third num");
        int c= sc.nextInt();
     
		 if (a>b & b>c)
      {
		 System.out.println("largest num is="+a);	 
	  }
		 else if (b>c)
	  {
	     System.out.println("Largest num is="+b); 
	  }
		 else
			 System.out.println("Largest num is="+c);
	}

}
