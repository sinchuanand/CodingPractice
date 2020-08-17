package codingPractice;

import java.util.Scanner;

public class BiggestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("The largest of three numbers");
		 System.out.println("Enter the first num");
		 int a = sc.nextInt();
		 System.out.println("Enter the 2nd num");
		 int b= sc.nextInt();
		 System.out.println("Enter the 3rd num");
		 int c= sc.nextInt();
		 if (a>b&a>c) {
			 System.out.println(" a is the largest three number is="+a);
		 }
			 else if(b>c) {
				 System.out.println("b is the largest of three num="+b);
			 }
			 else {
				 System.out.println("c is the largest of three num="+c);
		 }

	}

}
