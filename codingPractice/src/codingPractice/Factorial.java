package codingPractice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;) {
Scanner sc = new Scanner(System.in);
 System.out.println("Enter the number");
          int num =sc.nextInt();
          int f=1;
              for (int i=num;i>1; i--) {
	       f=f*i;
  }
           System.out.println("the factorial of f="+f);
           System.out.println();
  }
}
}