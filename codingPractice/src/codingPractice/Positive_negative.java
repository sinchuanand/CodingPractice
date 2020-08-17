package Demo;

import java.util.Scanner;

public class Positive_negative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
	     int num= sc.nextInt();
	     if(num>0) {
	    	 System.out.println("Num is positive="+num);
	     }
	     else if(num<0) {
	    	 System.out.println("Num is negative"+num);
	     }
	     else {
	    	 System.out.println("Num is either positive or negative");
	     }
	}

}
