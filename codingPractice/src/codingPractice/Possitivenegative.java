package codingPractice;

import java.util.Scanner;

public class Possitivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		if (num>0) {
			System.out.println("The num is positive");
		}   else if (num<0){
			System.out.println("The num is negative");
		} else {
			System.out.println("The num is niether positive nor negative");
		
		
		}
	}

}
