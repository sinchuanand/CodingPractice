package codingPractice;

import java.util.Scanner;

public class Evennodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if (num%2==0) {
			System.out.println("The num is even="+num);
		} else {
			System.out.println("The num is odd="+num);
		}

	}

}
