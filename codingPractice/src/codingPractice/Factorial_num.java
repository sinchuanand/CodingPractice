package codingPractice;

import java.util.Scanner;

public class Factorial_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("Entert the num");
        int num= sc.nextInt();
        int f=1;
        for(int i=1; i<=num; i++)
        {
        	f=f*i;
        }
        	System.out.println(f);
        
       
	}    

}
