import java.util.Scanner;

public class Swap_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Before swaping");
		System.out.println("Enter the first num X=");
		int x=sc.nextInt();
		System.out.println("Enter the second num Y=");
		int y=sc.nextInt();
		System.out.println("After swaping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		
		
		
		

	

}
}