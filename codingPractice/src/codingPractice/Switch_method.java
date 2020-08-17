import java.util.Scanner;

public class Switch_method {
	
	public static void calc(int a, int b, int operation) {
		int c;
		
			switch(operation) {
			case 1:
				 c = a + b;
	                System.out.print("Output-" + c);
	                break;
				
			case 2:
				c = a - b;
                System.out.print("Output-" + c);
                break;
			case 3:
				c = a * b;
                System.out.print("Output-" + c);
                break;
			case 4:
				c = a / b;
                System.out.print("Output-" + c);
                break;
				
			default :
	        	System.out.println("Enter the correct operation");
	        	break;
			}
			
		
			
		}
		
public static void main(String[] args) {
	int a,b;
	int  operation;
	System.out.print("Enter your choice -");
    Scanner var = new Scanner(System.in);
   operation = var.nextInt();
    System.out.print("Enter first number -");
    a = var.nextInt();
    System.out.print("Enter second number -");
    b = var.nextInt();
    calc(a,b,operation);
    
}

     
      
	}


