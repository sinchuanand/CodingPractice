import java.util.Scanner;

public class Pascal_triangle {
	public static void main(String[] args) 
	{
		int n = 4;
		int r, num;
		for (int i = 0; i <= n; i++) {
		    num = 1;
		    r = i + 1;
		    //pre-spacing
		    for (int j = n - i; j > 0; j--) {
		        System.out.print(" ");
		    }
		    for (int col = 0; col <= i; col++) {
		        if (col > 0) {
		            num = num * (r - col) / col;
		        }
		        System.out.print(num + " ");
		    }
		    System.out.println();
		}   }
	}