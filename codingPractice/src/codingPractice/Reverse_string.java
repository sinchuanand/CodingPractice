import java.util.Scanner;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		for(int i=s.length()-1; i>=0; i--)
		{
		System.out.print(s.charAt(i));
		}
	

	}

}
