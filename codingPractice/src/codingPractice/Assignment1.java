package codingPractice;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(;;){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the operation");
 char operation=sc.next().charAt(0);
 System.out.println("Enter the firstno");
 int firstno=sc.nextInt();
 System.out.println("Enter the secondno");
  int secondno=sc.nextInt();
  if( operation=='+') {
	  System.out.println("The addition of num is="+(firstno+secondno));
	  
  }  if(operation=='-') {
	  System.out.println("the sub of num is="+(firstno-secondno));
  }  if(operation=='*') {
	  System.out.println("the mul of num is="+(firstno*secondno));
  }  if(operation=='/'){
	  System.out.println("the div/ of num is="+(firstno/secondno));
  }
	  System.out.println();  
  }
	}
	}

